package com.example.bundle_serializable_parcelable

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundle_serializable_parcelable.databinding.ActivityResultParcelableBinding

@Suppress("DEPRECATION")
class ResultParcelableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultParcelableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getParcelable()
    }

    @SuppressLint("SetTextI18n")
    fun getParcelable(){
        val data = intent.getParcelableExtra<DataParcelable>("dataParcel")
        val nama = data?.nama
        val email = data?.email
        val phone = data?.phone
        val address = data?.address
        val age = data?.age
        binding.getNama.text = ":   $nama"
        binding.getEmail.text = ":   $email"
        binding.getPhone.text = ":   $phone"
        binding.getAddress.text = ":   $address"
        binding.getAge.text = ":   $age"
    }
}