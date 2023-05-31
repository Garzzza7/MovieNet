package com.example.movienet

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContentProviderCompat.requireContext

class RegisterViewModel : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var email: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_layout)

        var username: EditText = findViewById(R.id.user_name)
        var password: EditText = findViewById(R.id.pswd_signup)
        var email: EditText = findViewById(R.id.email_signup)

        var signup_button: Button = findViewById(R.id.signup_btn)
        var login_button: Button = findViewById(R.id.login_signup)

        signup_button.setOnClickListener {
            val intent = Intent(this, LoginViewModel::class.java)
            startActivity(intent)
            //.makeText(this, "Register successful", Toast.LENGTH_SHORT).show()
            validateEmptyForm()
        }

        login_button.setOnClickListener {
            val intent = Intent(this, LoginViewModel::class.java)
            startActivity(intent)
            //.makeText(this, "Register successful", Toast.LENGTH_SHORT).show()
            validateEmptyForm()
        }
    }
    private fun validateEmptyForm() {
        val icon = AppCompatResources.getDrawable(this, R.drawable.ic_warning)
        icon?.setBounds(0,0, icon.intrinsicWidth, icon.intrinsicHeight)

        when {
            TextUtils.isEmpty(username.text.toString().trim()) -> {
                username.setError("Please enter username", icon)
            }

            TextUtils.isEmpty(password.text.toString().trim()) -> {
                password.setError("Please enter password", icon)
            }

            TextUtils.isEmpty(email.text.toString().trim()) -> {
                email.setError("Please enter email", icon)
            }

            username.text.toString().isNotEmpty() &&
                    password.text.toString().isNotEmpty() &&
                    email.text.toString().isNotEmpty() -> {
                if (username.text.toString().length >= 5) {
                    if (email.text.toString()
                            .matches(Regex("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"))
                    ) {
                        if (password.text.toString().length >= 5) {
                        } else {
                            password.setError("Please enter a password with at least 5 characters", icon)
                        }
                    } else {
                        username.setError("Please enter a valid email", icon)
                    }
                } else {
                    email.setError("Please enter a valid username", icon)
                }
            }
        }
    }
}
