package com.example.constraintslayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var btn_c_v : Button? = null
    var btn_e_l : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_c_v = findViewById(R.id.btn_c_l)
        btn_e_l = findViewById(R.id.btn_e_v)


        btn_c_v?.setOnClickListener {
            var intent = Intent(this, ConstraintsLayoutActivity::class.java)
            startActivity(intent)
        }

        btn_e_l?.setOnClickListener {
            var intent = Intent(this, ExploreViewsActivity::class.java)
            startActivity(intent)
        }
    }
}