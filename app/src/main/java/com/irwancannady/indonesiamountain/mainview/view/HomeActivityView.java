package com.irwancannady.indonesiamountain.mainview.view;
// Created by irwancannady (irwancannady@gmail.com) on 4/27/17 at 5:43 PM.

import com.irwancannady.indonesiamountain.model.MountainEntity;

public interface HomeActivityView {

    void loadingView();

    void clearView();

    void failure(String messageError);

    void success(MountainEntity mountainEntity);
}
