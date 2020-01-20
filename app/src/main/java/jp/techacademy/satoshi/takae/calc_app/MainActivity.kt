package jp.techacademy.satoshi.takae.calc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity


class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        override fun onClick(v:View) {

            EditText editText1=(EditText)findViewById(R.id.editText1)
            EditText editText2=(EditText)findViewById(R.id.editText2)

            String str1 = editText1.getText().toString()
            String str2 = editText2.getText().toString()

            int num1 = Integer.parseInt(str1)
            int num2 = Integer.parseInt(str2)
            int result = num1 + num2
            TextView textView1 = (TextView)findViewById(R.id.textView)
            String str3 = String.valueOf(result)
            textView1.setText(str3)
        }

    }

    button1.setOnClickListener(this)
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