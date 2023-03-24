package com.example.bundle_serializable_parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundle_serializable_parcelable.databinding.ActivitySerializableBinding

class SerializableActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySerializableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySerializableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.filledButtonSave.setOnClickListener {
            val intent = Intent(this, ResultSerializableActivity::class.java)
            val nama = binding.etNama.text.toString()
            val email = binding.etEmail.text.toString()
            val phone = binding.etPhone.text.toString().toLong()
            val address = binding.etAddress.text.toString()
            val age = binding.etAge.text.toString().toInt()
            val dataSerializable = DataSerializable(nama, email, phone, address, age)
            intent.putExtra("dataSerial", dataSerializable)
            startActivity(intent)

        }


    }


}