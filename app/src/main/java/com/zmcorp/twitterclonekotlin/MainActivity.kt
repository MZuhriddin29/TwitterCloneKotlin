package com.zmcorp.twitterclonekotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        initView()
    }
    fun initView(){
        var buttonm = findViewById<Button>(R.id.b_create_account)
        buttonm.setOnClickListener {
            openDetailActivity()
        }
    }

    open fun openDetailActivity() {
        val intentz = Intent(this, PhotoActivity::class.java)
        startActivity(intentz)
    }

}