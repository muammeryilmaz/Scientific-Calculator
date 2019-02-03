package com.example.muammer.scientificcalculator

import android.os.Parcel
import android.os.Parcelable

class OpNode() : Parcelable {
    var sayi1 : Double=0.0
    var islem : String=""

    constructor(parcel: Parcel) : this() {
        sayi1 = parcel.readDouble()
        islem = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeDouble(sayi1)
        parcel.writeString(islem)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OpNode> {
        override fun createFromParcel(parcel: Parcel): OpNode {
            return OpNode(parcel)
        }

        override fun newArray(size: Int): Array<OpNode?> {
            return arrayOfNulls(size)
        }
    }
}