package com.application.moviecatalogue.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val id: Int?,
    val title: String?,
    val release: String?,
    val score: Double?,
    val overview: String?,
    val poster: String?,
    val backdrop: String?,
    var isFav: Boolean = false
) : Parcelable