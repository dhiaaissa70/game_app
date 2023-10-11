package tn.esprit.gamerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val btnRegister : Button = findViewById(R.id.btnregistre)
        btnRegister.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

       val btnforgetPaswword : Button = findViewById(R.id.btnForgotPasswords)
        btnforgetPaswword.setOnClickListener {
            val intent = Intent(this,ForgetPassword::class.java)
            startActivity(intent)
        }

        val btnLogin: Button = findViewById(R.id.btnLogIn)
        val btnFB : ImageView = findViewById(R.id.Fb)
        val btngoogle : ImageView = findViewById(R.id.google)


        btnLogin.setOnClickListener {
            val emailTextInput: TextInputLayout = findViewById(R.id.EmailAddress)
            val emailEditText = emailTextInput.editText
            val passwordTextInput: TextInputLayout = findViewById(R.id.Password)
            val passwordEditText =passwordTextInput.editText
            val email = emailEditText?.text.toString()
            val password = passwordEditText?.text.toString()

            if (!isValidEmail(email)) {
                emailTextInput.error = "You need a valid Email Address"
                val snackbar =Snackbar.make(it, "You have some errors in your inputs!", Snackbar.LENGTH_SHORT)
                snackbar.show()
            } else {
                emailTextInput.error = null
            }

            if (password.isEmpty()) {
                passwordTextInput.error = "Password cannot be empty"
                val snackbar = Snackbar.make(it, "You have some errors in your inputs!", Snackbar.LENGTH_SHORT)
                snackbar.show()
            } else {
                val intent = Intent(this,HomeScreen::class.java)
                startActivity(intent)

            }
        }
        btnFB.setOnClickListener(){
            val snackbar =Snackbar.make(it, "Comming Soon!", Snackbar.LENGTH_SHORT)
            snackbar.show()
        }
        btngoogle.setOnClickListener(){
            val snackbar =Snackbar.make(it, "Comming Soon!", Snackbar.LENGTH_SHORT)
            snackbar.show()
        }


    }

    fun isValidEmail(email: String): Boolean {
        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        return email.matches(emailPattern.toRegex())
    }

}
