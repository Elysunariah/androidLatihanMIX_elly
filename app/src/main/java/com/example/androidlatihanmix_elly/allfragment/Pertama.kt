package com.example.androidlatihanmix_elly.allfragment

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.Toolbar
import com.example.androidlatihanmix_elly.R

class Pertama : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fr_satu)
    }

    fun onButtonClick(fontsize: Int, text: String) {

    }
}