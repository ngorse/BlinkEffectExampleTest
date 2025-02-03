package io.sspinc.blinkeffectexampletest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.buttonView)
        btn.setOnClickListener {
            // use of blink-library
            btn.setText("YOU GOT ME!")
            BlinkEffect.blink(btn)
        }
    }
}
