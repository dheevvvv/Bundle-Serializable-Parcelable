package com.example.bundle_serializable_parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundle_serializable_parcelable.databinding.ActivityBundleBinding

class BundleActivity : AppCompatActivity() {
    lateinit var binding:ActivityBundleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.filledButtonBundleSave.setOnClickListener {
            val intent = Intent(this, ResultBundleActivity::class.java)
            val bundle = Bundle()
            val inputNama = binding.etNama.text.toString()
            val inputTahunLahir = binding.etTahunLahir.text.toString().toInt()
            bundle.putString("nama", inputNama)
            bundle.putInt("tahunLahir", inputTahunLahir)
            intent.putExtras(bundle)
            startActivity(intent)
        }


    }



}