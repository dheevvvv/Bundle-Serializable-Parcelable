package com.example.bundle_serializable_parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundle_serializable_parcelable.databinding.ActivityParcelableBinding

class ParcelableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityParcelableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.filledButtonSave.setOnClickListener {
            val intent = Intent(this, ResultParcelableActivity::class.java)
            val nama = binding.etNama.text.toString()
            val email = binding.etEmail.text.toString()
            val phone = binding.etPhone.text.toString().toLong()
            val address = binding.etAddress.text.toString()
            val age = binding.etAge.text.toString().toInt()
            val dataParcelable = DataParcelable(nama, email, phone, address, age)
            intent.putExtra("dataParcel", dataParcelable)
            startActivity(intent)
        }
    }
}