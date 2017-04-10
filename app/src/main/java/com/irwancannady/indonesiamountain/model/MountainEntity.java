package com.irwancannady.indonesiamountain.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by irwancannady on 4/10/17.
 * irwancannady@gmail.com
 */

public class MountainEntity {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("pulau")
    @Expose
    private String pulau;
    @SerializedName("nama_gunung")
    @Expose
    private List<String> namaGunung = null;
    @SerializedName("lati")
    @Expose
    private Float lati;
    @SerializedName("longi")
    @Expose
    private Float longi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPulau() {
        return pulau;
    }

    public void setPulau(String pulau) {
        this.pulau = pulau;
    }

    public List<String> getNamaGunung() {
        return namaGunung;
    }

    public void setNamaGunung(List<String> namaGunung) {
        this.namaGunung = namaGunung;
    }

    public Float getLati() {
        return lati;
    }

    public void setLati(Float lati) {
        this.lati = lati;
    }

    public Float getLongi() {
        return longi;
    }

    public void setLongi(Float longi) {
        this.longi = longi;
    }

}