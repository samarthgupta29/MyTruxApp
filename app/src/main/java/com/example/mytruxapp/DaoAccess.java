package com.example.mytruxapp;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.location.Location;

import java.util.List;

@Dao
public interface DaoAccess {

    @Insert
    void insertData(CoordinatesEntity coordinatesEntities);

    @Query("SELECT * FROM CoordinatesEntity")
    List<CoordinatesEntity> fetchData();
}
