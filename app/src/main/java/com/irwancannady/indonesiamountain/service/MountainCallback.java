package com.irwancannady.indonesiamountain.service;
// Created by irwancannady (irwancannady@gmail.com) on 4/27/17 at 3:48 PM.

import com.irwancannady.indonesiamountain.model.MountainEntity;

public interface MountainCallback {

    void onSuccess(MountainEntity mountainEntity);

    void onError(NetworkError networkError);
}
