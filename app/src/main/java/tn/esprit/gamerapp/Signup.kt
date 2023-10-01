package tn.esprit.gamerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class Signup: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)


        val btnSignup: Button = findViewById(R.id.btnSubmit)



        btnSignup.setOnClickListener {
            val fullnameTextInput: TextInputLayout = findViewById(R.id.FullName)
            val fullnameEditText = fullnameTextInput.editText
            val emailTextInput: TextInputLayout = findViewById(R.id.EmailAddress)
            val emailEditText = emailTextInput.editText
            val passwordTextInput: TextInputLayout = findViewById(R.id.Password)
            val passwordEditText =passwordTextInput.editText
            val confirmpasswordTextInput: TextInputLayout = findViewById(R.id.ConfirmPassword)
            val confirmpasswordEditText =confirmpasswordTextInput.editText
            val fullname= fullnameEditText?.text.toString()
            val email = emailEditText?.text.toString()
            val password = passwordEditText?.text.toString()
            val confirmpassword = confirmpasswordEditText?.text.toString()
            val snackbar = Snackbar.make(it, "You have some errors in your inputs!", Snackbar.LENGTH_SHORT)
            if (!isValidFullName(fullname)){
                fullnameTextInput.error="You need a valid FullName"

                snackbar.show()
            }
            else{
                    fullnameTextInput.error=null
            }
            if (!isValidEmail(email)) {
                emailTextInput.error = "You need a valid Email Address"

                snackbar.show()
            } else {
                emailTextInput.error = null
            }

            if (password.isEmpty()) {
                passwordTextInput.error = "Password cannot be empty"
                snackbar.show()
            } else {
                passwordTextInput.error = null
            }

            if (confirmpassword.isEmpty()) {
                confirmpasswordTextInput.error = "Confirm password cannot be empty"
                snackbar.show()
            } else if (confirmpassword != password) {
                confirmpasswordTextInput.error = "Passwords do not match"
                snackbar.show()
            } else {
                confirmpasswordTextInput.error = null

            }
        }
        }



    }

    fun isValidEmail(email: String): Boolean {
        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        return email.matches(emailPattern.toRegex())

    }

    fun isValidFullName(fullName: String): Boolean {
        val fullNamePattern = "^[A-Za-zÀ-ÖØ-öø-ÿ\\s'-]+\$"
        return fullName.matches(fullNamePattern.toRegex())
    }




