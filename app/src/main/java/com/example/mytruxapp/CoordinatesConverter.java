package com.example.mytruxapp;

import android.arch.persistence.room.TypeConverter;
import android.location.Location;

import com.google.android.gms.location.LocationResult;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

class CoordinatesConverter {
    @TypeConverter
    public static String saveList(CoordinatesPOJO coordinatesPOJO) {
        Gson gson = new Gson();
        return gson.toJson(coordinatesPOJO);
    }

    @TypeConverter
    public static CoordinatesPOJO readList(String value) {
        Type listType = new TypeToken<CoordinatesPOJO>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }
}
