package tn.esprit.gamerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class OtpValidation: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.validation)


        val btnverify : Button = findViewById(R.id.btnverify)
        btnverify.setOnClickListener {
            val inputText1: TextInputLayout = findViewById(R.id.input1)
            val input1EditText = inputText1.editText
            val inputText2: TextInputLayout = findViewById(R.id.input2)
            val input2EditText = inputText2.editText
            val inputText3: TextInputLayout = findViewById(R.id.input3)
            val input3EditText = inputText3.editText
            val inputText4: TextInputLayout = findViewById(R.id.input4)
            val input4EditText = inputText4.editText

            val input1 = input1EditText?.text.toString()
            val input2 = input2EditText?.text.toString()
            val input3 = input3EditText?.text.toString()
            val input4 = input4EditText?.text.toString()
            val snack = Snackbar.make(it, "Wrong Code", Snackbar.LENGTH_SHORT)
            val snackbar = Snackbar.make(it, "One of Your inputs is Empty", Snackbar.LENGTH_SHORT)
            if( input1.isEmpty() || input2.isEmpty() || input3.isEmpty() || input4.isEmpty()){
                snackbar.show()
            }
            else if (input1!="1" || input2!="2" || input3!="3" || input4!="4")
            {
                snack.show()
            }
            else{
                val intent = Intent(this,ResetPassword::class.java)
                startActivity(intent)
            }


        }


    }
}