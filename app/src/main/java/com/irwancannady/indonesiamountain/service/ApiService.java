package com.irwancannady.indonesiamountain.service;


import com.irwancannady.indonesiamountain.model.MountainEntity;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by irwancannady on 4/10/17.
 * irwancannady@gmail.com
 */

public interface ApiService {

    @GET("")
    Observable<MountainEntity> getDataMountain();
}
