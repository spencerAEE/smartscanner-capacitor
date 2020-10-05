package com.newlogic.mlkitlib.newlogic.config

import android.os.Parcelable
import com.newlogic.mlkitlib.newlogic.extension.empty
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ReaderConfig(
        val font: String,
        val language: String,
        val label: String,
        val mode: String,
        val withFlash: Boolean
) : Parcelable {
    companion object {
        fun empty() = ReaderConfig(String.empty(), String.empty(), String.empty(), String.empty(), false)
    }
}