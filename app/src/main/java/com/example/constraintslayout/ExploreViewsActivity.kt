package com.example.constraintslayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.SeekBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ExploreViewsActivity : AppCompatActivity() {
    var radioGroup : RadioGroup? = null
    var rbMale : RadioButton? = null
    var rbFemale : RadioButton? = null
    var progressBar : ProgressBar? = null
    var seekBar : SeekBar? = null
    var floatingActionBtn : FloatingActionButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore_views)
        radioGroup = findViewById(R.id.radioGroup)
        rbMale = findViewById(R.id.rbMale)
        rbFemale = findViewById(R.id.rbFemale)
        progressBar = findViewById(R.id.progressBar)
        seekBar = findViewById(R.id.seekBar)
        floatingActionBtn = findViewById(R.id.floatingActionBtn)
    }
}