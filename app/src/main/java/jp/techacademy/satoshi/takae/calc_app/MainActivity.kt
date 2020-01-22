package jp.techacademy.satoshi.takae.calc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }
        override fun onClick(v: View) {
            if (v.id == R.id.button1){
                val editText1 = findViewById(R.id.editText1) as EditText
                val editText2 = findViewById(R.id.editText2) as EditText

                val str1 = editText1.getText().toString()
                val str2 = editText2.getText().toString()

                val num1 = str1.toDouble()
                val num2 = str2.toDouble()

                val num3 = num1 + num2

                val intent = Intent(this,Main2Activity::class.java)
                intent.putExtra("result",num3)
                intent.putExtra("result",num3)
                startActivity(intent)
            }else if(v.id == R.id.button2){
                val editText1 = findViewById(R.id.editText1) as EditText
                val editText2 = findViewById(R.id.editText2) as EditText

                val str1 = editText1.getText().toString()
                val str2 = editText2.getText().toString()

                val num1 = str1.toDouble()
                val num2 = str2.toDouble()

                val num3 = num1 - num2

                val intent = Intent(this,Main2Activity::class.java)
                intent.putExtra("result",num3)
                intent.putExtra("result",num3)
                startActivity(intent)
            }else if(v.id == R.id.button3) {
                val editText1 = findViewById(R.id.editText1) as EditText
                val editText2 = findViewById(R.id.editText2) as EditText

                val str1 = editText1.getText().toString()
                val str2 = editText2.getText().toString()

                val num1 = str1.toDouble()
                val num2 = str2.toDouble()

                val num3 = num1 * num2

                val intent = Intent(this,Main2Activity::class.java)
                intent.putExtra("result",num3)
                intent.putExtra("result",num3)
                startActivity(intent)
            }else if(v.id == R.id.button4){
                val editText1 = findViewById(R.id.editText1) as EditText
                val editText2 = findViewById(R.id.editText2) as EditText

                val str1 = editText1.getText().toString()
                val str2 = editText2.getText().toString()

                val num1 = str1.toDouble()
                val num2 = str2.toDouble()

                val num3 = num1 / num2

                val intent = Intent(this,Main2Activity::class.java)
                intent.putExtra("result",num3)
                intent.putExtra("result",num3)
                startActivity(intent)
            }
        }
}