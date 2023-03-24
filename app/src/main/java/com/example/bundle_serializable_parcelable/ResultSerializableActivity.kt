package com.example.bundle_serializable_parcelable

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundle_serializable_parcelable.databinding.ActivityResultSerializableBinding

@Suppress("DEPRECATION")
class ResultSerializableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultSerializableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultSerializableBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getSerializable()

    }

    @SuppressLint("SetTextI18n")
    fun getSerializable(){
        val data = intent.getSerializableExtra("dataSerial") as DataSerializable
        val nama = data.nama
        val email = data.email
        val phone = data.phone
        val address = data.address
        val age = data.age
        binding.getNama.text = ":   $nama"
        binding.getEmail.text = ":   $email"
        binding.getPhone.text = ":   $phone"
        binding.getAddress.text = ":   $address"
        binding.getAge.text = ":   $age"
    }
}