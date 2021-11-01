package com.example.seoulweather.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LatLng(
        val latitude: Float,
        val longitude: Float,
        val lastUpdate: Long
): Parcelable