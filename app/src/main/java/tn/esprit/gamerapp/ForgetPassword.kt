package tn.esprit.gamerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class ForgetPassword: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgetpassword)


        val btnSms : Button = findViewById(R.id.sendSms)
        btnSms.setOnClickListener {
            val intent = Intent(this,OtpValidation::class.java)
            startActivity(intent)
        }

        val btnEmail: Button = findViewById(R.id.submit)
        btnEmail.setOnClickListener(){
            val emailTextInput: TextInputLayout = findViewById(R.id.EmailAddress)
            val emailEditText = emailTextInput.editText
            val email = emailEditText?.text.toString()
            val snackbar = Snackbar.make(it, "You have some errors in your inputs!", Snackbar.LENGTH_SHORT)
            val snackbarEmailSent = Snackbar.make(it, "Email has been sent", Snackbar.LENGTH_SHORT)
            if (!isValidEmail(email)) {
                emailTextInput.error = "You need a valid Email Address"
                snackbar.show()
            } else {
                emailTextInput.error = null
                snackbarEmailSent.show()
            }
        }
    }
    fun isValidEmail(email: String): Boolean {
        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        return email.matches(emailPattern.toRegex())
    }
}