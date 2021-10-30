package com.example.seoulweather.data.model.weather

enum class WeatherGrade(val weather: String) {
    CLOUDS("cloudy"),
    CLEAR("day-sunny"),
    ATMOSPHERE("cloudy-gusts"),
    SNOW("snow"),
    RAIN("rains"),
    DRIZZLE("rain"),
    THUNDERSTORM("lightningT")
}