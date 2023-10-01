package tn.esprit.gamerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class ResetPassword: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resetpassword)
        val btnsubmit: Button = findViewById(R.id.submit1)
        val passwordTextInput: TextInputLayout = findViewById(R.id.Password)
        val passwordEditText = passwordTextInput.editText
        val confirmpasswordTextInput: TextInputLayout = findViewById(R.id.ConfirmPassword)
        val confirmpasswordEditText = confirmpasswordTextInput.editText

        btnsubmit.setOnClickListener {
            val password = passwordEditText?.text.toString()
            val confirmpassword = confirmpasswordEditText?.text.toString()

            val snackbar = Snackbar.make(it, "You have some errors in your inputs!", Snackbar.LENGTH_SHORT)

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
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}