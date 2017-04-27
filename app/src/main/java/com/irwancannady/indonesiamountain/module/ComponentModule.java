package com.irwancannady.indonesiamountain.module;
// Created by irwancannady (irwancannady@gmail.com) on 4/27/17 at 4:40 PM.


import com.irwancannady.indonesiamountain.mainview.HomeActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ModuleNetwork.class,})
public interface ComponentModule {

    void inject(HomeActivity homeActivity);

}
