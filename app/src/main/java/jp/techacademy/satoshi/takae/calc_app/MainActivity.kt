package jp.techacademy.satoshi.takae.calc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            button1.setOnClickListener(this)

        val editText1 = findViewById(R.id.editText1) as EditText
        val editText2 = findViewById(R.id.editText2) as EditText

        val str1 = editText1.getText().toString()
        val str2 = editText2.getText().toString()

        val num1 = Integer.parseInt(str1)
        val num2 = Integer.parseInt(str2)
        

        val num3 = num1 + num2
            TextView textView1 = (TextView)findViewById(R.id.textView1)
        val  str3 = String.valueOf(result)
            textView1.setText(str3)
        }

    }

    button2.setOnClickListener(this)
    button3.setOnClickListener(this)
    button4.setOnClickListener(this)
}
override fun onClick(v: View?){
    val intent = Intent(this,Main2Activity::class.java)
    intent.putExtra("VALUE1",10)
    intent.putExtra("VALUE2",20)
    startActivity(intent)

}
}