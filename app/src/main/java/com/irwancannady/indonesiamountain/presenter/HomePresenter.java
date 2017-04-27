package com.irwancannady.indonesiamountain.presenter;
// Created by irwancannady (irwancannady@gmail.com) on 4/27/17 at 7:12 PM.

import com.irwancannady.indonesiamountain.mainview.view.HomeActivityView;
import com.irwancannady.indonesiamountain.model.MountainEntity;
import com.irwancannady.indonesiamountain.service.MountainCallback;
import com.irwancannady.indonesiamountain.service.NetworkError;
import com.irwancannady.indonesiamountain.service.ServiceApp;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public class HomePresenter {

    private final ServiceApp serviceApp;
    private final HomeActivityView homeActivityView;
    private CompositeSubscription subscriptions;

    public HomePresenter(ServiceApp serviceApp, HomeActivityView homeActivityView) {
        this.serviceApp = serviceApp;
        this.homeActivityView = homeActivityView;
        this.subscriptions = new CompositeSubscription();
    }

    public void getMountainList(){

        homeActivityView.loadingView();

        Subscription subscription = serviceApp.getMountainList(new MountainCallback() {
            @Override
            public void onSuccess(MountainEntity mountainEntity) {
                homeActivityView.clearLoading();
                homeActivityView.success(mountainEntity);
            }

            @Override
            public void onError(NetworkError networkError) {
                homeActivityView.clearLoading();
                homeActivityView.failure(networkError.getAppErrorMessage());
            }
        });

        subscriptions.add(subscription);
    }

    public void onStop(){
        subscriptions.unsubscribe();
    }
}
