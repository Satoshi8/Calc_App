package jp.techacademy.satoshi.takae.calc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val value1 = intent.getIntExtra("VALUE1",0)
        val value2 = intent.getIntExtra("VALUE2",0)

        textView.text = "${value1 + value2}"
    }
}

