package com.svalero.bestread.domain;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Library {

    @PrimaryKey(autoGenerate = true)
    private long id;
    @NonNull
    private String name;
    @ColumnInfo
    private String description;
    @ColumnInfo
    private String city;
    @ColumnInfo
    private boolean verify;
    @ColumnInfo
    private double latitude;
    @ColumnInfo
    private double longitude;


    public Library(){

    }

    public Library(String name, String description, String city, boolean verify, double latitude, double longitude) {
        this.name = name;
        this.description = description;
        this.city = city;
        this.verify = verify;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isVerify() {
        return verify;
    }

    public void setVerify(boolean verify) {
        this.verify = verify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }



}
