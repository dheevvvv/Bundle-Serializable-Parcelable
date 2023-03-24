package com.example.bundle_serializable_parcelable

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundle_serializable_parcelable.databinding.ActivityResultBundleBinding
import java.util.*

class ResultBundleActivity : AppCompatActivity() {
    private lateinit var binding : ActivityResultBundleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getBundle()
    }
    val calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    fun getBundle(){
        val bundle = intent.extras
        val nama = bundle?.getString("nama")
        val tahunLahir = bundle?.getInt("tahunLahir")
        val umur = year - tahunLahir!!
        binding.txtHasil.text = "Halo, $nama \n umur kamu $umur "
    }
}