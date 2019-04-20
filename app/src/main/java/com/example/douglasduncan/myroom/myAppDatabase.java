package com.example.douglasduncan.myroom;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {mileages.class}, version=1)
public abstract class myAppDatabase extends RoomDatabase {


public abstract myDOA myDOAobject();
}
