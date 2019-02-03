package com.example.muammer.scientificcalculator

import android.os.Parcel
import android.os.Parcelable

class Operations() : Parcelable {
    var islemler = arrayListOf<OpNode>()

    constructor(parcel: Parcel) : this() {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Operations> {
        override fun createFromParcel(parcel: Parcel): Operations {
            return Operations(parcel)
        }

        override fun newArray(size: Int): Array<Operations?> {
            return arrayOfNulls(size)
        }
    }
}