package com.sklinn.medicalutility

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tb_datecalculator.*


class TBDateActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tb_datecalculator)

        tbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }




}