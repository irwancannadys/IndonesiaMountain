package com.irwancannady.indonesiamountain.service;
// Created by irwancannady (irwancannady@gmail.com) on 4/27/17 at 8:04 PM.


import com.google.gson.annotations.SerializedName;

public class Response {
    @SerializedName("status")
    public String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @SuppressWarnings({"unused", "used by Retrofit"})
    public Response() {
    }

    public Response(String status) {
        this.status = status;
    }
}
