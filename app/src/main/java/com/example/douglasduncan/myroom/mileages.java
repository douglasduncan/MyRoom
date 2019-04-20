package com.example.douglasduncan.myroom;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "car_entries")
public class mileages {

    @PrimaryKey
    public int uid;



    @ColumnInfo(name = "vehicle_name")
    public String v_name;



}
