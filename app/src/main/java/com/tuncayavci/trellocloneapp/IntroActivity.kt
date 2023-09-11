package com.tuncayavci.trellocloneapp

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.tuncayavci.trellocloneapp.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private lateinit var binding : ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val typeFace : Typeface = Typeface.createFromAsset(assets,"AnticycloneDemo-Light.otf")
        binding.tvAppNameIntro.typeface = typeFace

        binding.btnSignUpIntro.setOnClickListener {
            startActivity(Intent(this@IntroActivity,SignUpActivity::class.java))
        }
    }
}