package com.ariqandrean.daftarvtuber.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class VtuberModel(
    var name: String,
    var profile: String,
    var detail: String,
//    var photo: Int,
    var photo: String,
    var ytUrl: String,
    var twitUrl: String
) :  Parcelable