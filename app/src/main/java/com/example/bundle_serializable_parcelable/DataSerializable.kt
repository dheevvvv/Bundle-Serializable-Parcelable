package com.example.bundle_serializable_parcelable

data class DataSerializable(val nama:String, val email:String, val phone:Long, val address:String, val age:Int) : java.io.Serializable {
}