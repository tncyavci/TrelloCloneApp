package com.tuncayavci.trellocloneapp

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.tuncayavci.trellocloneapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        val typeFace : Typeface = Typeface.createFromAsset(assets,"AnticycloneDemo-Light.otf")
        binding.tvAppName.typeface = typeFace

        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity, IntroActivity::class.java))
            finish()
        },2500)

    }
}