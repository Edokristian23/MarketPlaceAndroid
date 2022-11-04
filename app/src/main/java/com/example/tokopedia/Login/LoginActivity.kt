package com.example.tokopedia.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tokopedia.R
import com.example.tokopedia.databinding.ActivityLoginBinding
import com.example.tokopedia.util.Prefs

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val s = Prefs(this)

        if (s.getIsLogin()){
            binding.tvStatus.text = "Sudah Login"
        } else{
            binding.tvStatus.text = "Belum Login"
        }

        binding.tvLogin.setOnClickListener {
            s.setIsLogin(true)
            onBackPressed()
        }

        binding.tvLogout.setOnClickListener {
            s.setIsLogin(false)
            onBackPressed()
        }
    }
}