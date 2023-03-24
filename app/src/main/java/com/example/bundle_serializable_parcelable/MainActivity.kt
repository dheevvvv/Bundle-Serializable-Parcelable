package com.example.bundle_serializable_parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundle_serializable_parcelable.databinding.ActivityBundleBinding
import com.example.bundle_serializable_parcelable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.filledButtonBundle.setOnClickListener {
            val intent = Intent(this, BundleActivity::class.java)
            startActivity(intent)
        }

        binding.filledButtonSerializable.setOnClickListener {
            val intent = Intent(this, SerializableActivity::class.java)
            startActivity(intent)
        }

        binding.filledButtonParcelable.setOnClickListener {
            val intent = Intent(this, ParcelableActivity::class.java)
            startActivity(intent)
        }
    }
}