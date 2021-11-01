package com.example.seoulweather.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.seoulweather.data.model.LatLng
import com.example.seoulweather.data.model.airquality.MeasuredValue
import com.example.seoulweather.data.model.weather.Weather

@Database(entities = [LatLng::class, MeasuredValue::class, Weather::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

}