package com.pramanth.bookingui.data

import androidx.annotation.DrawableRes

data class Destination(
    @DrawableRes val destinationImage : Int,
    val destinationName : String,
    val destinationRating : Float
)
