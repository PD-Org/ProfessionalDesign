package com.chineseivy.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Shiming Lee on 2018/3/22
 * 库存管理
 */
public class Warehouse implements Serializable {
    private int goodID;
    private int shopID;
    private int warehouseID;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date supplyTime;//上货时间
    private long supplyNumber;//上货数量
    private long wareNumber;//货物总数

    public Warehouse() {
    }

    public Warehouse(int goodID, int shopID, int warehouseID, Date supplyTime, long supplyNumber, long wareNumber) {
        this.goodID = goodID;
        this.shopID = shopID;
        this.warehouseID = warehouseID;
        this.supplyTime = supplyTime;
        this.supplyNumber = supplyNumber;
        this.wareNumber = wareNumber;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public int getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(int warehouseID) {
        this.warehouseID = warehouseID;
    }

    public Date getSupplyTime() {
        return supplyTime;
    }

    public void setSupplyTime(Date supplyTime) {
        this.supplyTime = supplyTime;
    }

    public long getSupplyNumber() {
        return supplyNumber;
    }

    public void setSupplyNumber(long supplyNumber) {
        this.supplyNumber = supplyNumber;
    }

    public long getWareNumber() {
        return wareNumber;
    }

    public void setWareNumber(long wareNumber) {
        this.wareNumber = wareNumber;
    }
}
