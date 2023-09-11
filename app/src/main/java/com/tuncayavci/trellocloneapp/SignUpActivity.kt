package com.tuncayavci.trellocloneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.tuncayavci.trellocloneapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setupActionBar()

    }

    private fun setupActionBar() {

        setSupportActionBar(binding.toolbarSignUpActivity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
        }

        binding.toolbarSignUpActivity.setNavigationOnClickListener { onBackPressed() }
    }
}