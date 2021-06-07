package com.sklinn.medicalutility

import android.app.DatePickerDialog
import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_tb_datecalculator.*
import java.text.SimpleDateFormat
import java.util.*


class TBDateActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tb_datecalculator)

        tbar.setNavigationOnClickListener {
            onBackPressed()
        }

        btn_check.setOnClickListener {

//            if (rbIR.isChecked){
//                containerView.visibility = View.VISIBLE
//                irRegimen()
//            }else if(rbRR.isChecked){
//                containerView.visibility = View.VISIBLE
//                rrRegimen()
//            }else if (rbIR.isChecked && cb_extension.isChecked){
//                containerView.visibility = View.VISIBLE
//                irRegimentExtend()
//            }else{
//                containerView.visibility = View.VISIBLE
//                rrRegimentExtend()
//            }
        }
    }


    private fun irRegimen(){
        lbM2.text = "M2"
        lbM5.text = "M5"
        lbM6.text = "M6"
        lbextension.visibility = View.GONE

        val calendar = Calendar.getInstance()
        val simpleDateFormat = SimpleDateFormat("dd-MMM-yyyy")

        val dpd = DatePickerDialog(this, {datePicker, year, month, date ->

            val newCalendar = Calendar.getInstance()
            newCalendar.set(Calendar.YEAR, year)
            newCalendar.set(Calendar.MONTH, month)
            newCalendar.set(Calendar.DAY_OF_MONTH, date)

            enrollDate.text = simpleDateFormat.format(newCalendar.time)

//            val monthTwo = newCalendar.add(Calendar.DAY_OF_MONTH,56)
//            val monthFive = newCalendar.add(Calendar.DAY_OF_MONTH,84)
//            val monthSix = newCalendar.add(Calendar.DAY_OF_MONTH,28)
//
//            simpleDateFormat.format(newCalendar.time)
//
//            m2Date.text  = monthTwo.toString()
//            m5Date.text = monthFive.toString()
//            m6Date.text = monthSix.toString()


        }, calendar[Calendar.YEAR], calendar[Calendar.MONTH], calendar[Calendar.DAY_OF_MONTH])
        dpd.show()
    }

    private fun irRegimentExtend(){
        lbM2.text = "M2"
        lbextension.text = "M3"
        lbM5.text = "M5"
        lbM6.text = "M7"
        lbextension.visibility = View.VISIBLE
    }

    private fun rrRegimen(){
        lbM2.text = "M3"
        lbM5.text = "M5"
        lbM6.text = "M8"
        lbextension.visibility = View.GONE
    }

    private fun rrRegimentExtend(){
        lbM2.text = "M3"
        lbextension.text = "M4"
        lbM5.text = "M5"
        lbM6.text = "M9"
        lbextension.visibility = View.VISIBLE
    }

}