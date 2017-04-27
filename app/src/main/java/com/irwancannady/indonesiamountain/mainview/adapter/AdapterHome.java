package com.irwancannady.indonesiamountain.mainview.adapter;
// Created by irwancannady (irwancannady@gmail.com) on 4/27/17 at 6:44 PM.

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.irwancannady.indonesiamountain.model.MountainEntity;

import java.util.List;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.ViewHolder> {


    private List<MountainEntity> mountainEntities;
    private Context context;

    public AdapterHome(List<MountainEntity> data, Context context) {
        this.mountainEntities = data;
        this.context = context;
    }

    @Override
    public AdapterHome.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public int getItemCount() {
        return mountainEntities.size();
    }

    @Override
    public void onBindViewHolder(AdapterHome.ViewHolder holder, int position) {

    }

    class ViewHolder extends RecyclerView.ViewHolder{



        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
