package com.irwancannady.indonesiamountain.mainview.adapter;
// Created by irwancannady (irwancannady@gmail.com) on 4/27/17 at 6:44 PM.

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.irwancannady.indonesiamountain.R;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home_list, null);
        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mountainEntities.size();
    }

    @Override
    public void onBindViewHolder(AdapterHome.ViewHolder holder, int position) {

        holder.tvCity.setText(mountainEntities.get(position).getPulau());
        String images = mountainEntities.get(position).getGunung().get(position).getFotoGunung(); //masih rancu

        Glide.with(context)
                .load(images)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .skipMemoryCache(true)
                .into(holder.background);

    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvCity;
        ImageView background;

        public ViewHolder(View itemView) {
            super(itemView);
            tvCity = (TextView) itemView.findViewById(R.id.city);
            background = (ImageView) itemView.findViewById(R.id.imageBackground);
        }
    }
}
