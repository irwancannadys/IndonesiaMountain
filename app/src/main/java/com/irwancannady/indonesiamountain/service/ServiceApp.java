package com.irwancannady.indonesiamountain.service;
// Created by irwancannady (irwancannady@gmail.com) on 4/27/17 at 3:47 PM.

import com.irwancannady.indonesiamountain.model.MountainEntity;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class ServiceApp {

    private final ApiService apiService;

    public ServiceApp(ApiService apiService) {
        this.apiService = apiService;
    }

    public Subscription getMountainList(MountainCallback mountainCallback){

        return apiService.getDataMountain()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onErrorResumeNext(new Func1<Throwable, Observable<? extends MountainEntity>>() {
                    @Override
                    public Observable<? extends MountainEntity> call(Throwable throwable) {
                        return null;
                    }
                }) .subscribe(new Subscriber<MountainEntity>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(MountainEntity mountainEntity) {

                    }
                });

    }
}
