package com.example.bundle_serializable_parcelable

import android.os.Parcel
import android.os.Parcelable

data class DataParcelable(val nama:String, val email:String, val phone:Long, val address:String, val age:Int):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readLong(),
        parcel.readString().toString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(email)
        parcel.writeLong(phone)
        parcel.writeString(address)
        parcel.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataParcelable> {
        override fun createFromParcel(parcel: Parcel): DataParcelable {
            return DataParcelable(parcel)
        }

        override fun newArray(size: Int): Array<DataParcelable?> {
            return arrayOfNulls(size)
        }
    }
}