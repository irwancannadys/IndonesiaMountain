package com.irwancannady.indonesiamountain.util;
// Created by irwancannady (irwancannady@gmail.com) on 4/27/17 at 4:54 PM.

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.irwancannady.indonesiamountain.module.ComponentModule;
import com.irwancannady.indonesiamountain.module.DaggerComponentModule;
import com.irwancannady.indonesiamountain.module.ModuleNetwork;

import java.io.File;

public class BaseApp extends AppCompatActivity {

    ComponentModule componentModule;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        componentModule = DaggerComponentModule.builder().moduleNetwork(new ModuleNetwork(cacheFile)).build();
    }

    public ComponentModule getComponentModule(){
        return componentModule;
    }
}
