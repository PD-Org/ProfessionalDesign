package com.chineseivy.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Shiming Lee on 2018/3/22
 */
public class Favourite {
    private int favouriteID;
    private int goodID;
    private int customerID;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date addFavouriteTime;

    public Favourite() {
    }

    public Favourite(int favouriteID, int goodID, int customerID, Date addFavouriteTime) {
        this.favouriteID = favouriteID;
        this.goodID = goodID;
        this.customerID = customerID;
        this.addFavouriteTime = addFavouriteTime;
    }

    public int getFavouriteID() {
        return favouriteID;
    }

    public void setFavouriteID(int favouriteID) {
        this.favouriteID = favouriteID;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getAddFavouriteTime() {
        return addFavouriteTime;
    }

    public void setAddFavouriteTime(Date addFavouriteTime) {
        this.addFavouriteTime = addFavouriteTime;
    }
}
