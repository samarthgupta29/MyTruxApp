package com.example.mytruxapp;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Room;
import android.content.Context;

import java.util.List;

public class CoordinatesRepository {
    private String DB_NAME = "AppDatabase";
    private AppDatabase appDatabase;
    public CoordinatesRepository(Context context){
        appDatabase = Room.databaseBuilder(context,AppDatabase.class,DB_NAME).build();
    }

    public List<CoordinatesEntity> fetchData(){
        return appDatabase.daoAccess().fetchData();
    }


}
