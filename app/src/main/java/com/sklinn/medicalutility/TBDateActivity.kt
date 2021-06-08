package com.sklinn.medicalutility

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tb_datecalculator.*
import java.text.SimpleDateFormat
import java.util.*


class TBDateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tb_datecalculator)

        hideView() //hide the content before btn click

        tbar.setNavigationOnClickListener {
            onBackPressed()
        }

        calendarIcon.setOnClickListener {
            val isIR = rbIR.isChecked
            val isRR = rbRR.isChecked
            val isExtension = cb_extension.isChecked

            if (isIR && !isRR && !isExtension) {
                irRegimen()
            } else if (!isIR && isRR && !isExtension) {
                rrRegimen()
            } else if (isIR && !isRR && isExtension) {
                irRegimentExtend()
            } else if (!isIR && isRR && isExtension) {
                rrRegimentExtend()
            } else {
                notify("Please choose treatment regimen")
            }
        }

    }

    private fun irRegimen() {

        val dateFormat = SimpleDateFormat("dd-MMM-yyyy")
        val calendar = Calendar.getInstance()

        DatePickerDialog(
            this,
            {picker, year, month, date->
                val newCalendar = Calendar.getInstance()

                newCalendar.set(year,month,date)
                enrollDate.text = dateFormat.format(newCalendar.time)//Enrollment Date

                newCalendar.add(Calendar.DAY_OF_MONTH, 56)
                lbM2.text = "M2"
                m2Date.text = dateFormat.format(newCalendar.time)

                newCalendar.add(Calendar.DAY_OF_MONTH, 84)
                lbM5.text = "M5"
                m5Date.text = dateFormat.format(newCalendar.time)

                newCalendar.add(Calendar.DAY_OF_MONTH, 28)
                lbM6.text = "M6"
                m6Date.text = dateFormat.format(newCalendar.time)

            },
            calendar[Calendar.YEAR],
            calendar[Calendar.MONTH],
            calendar[Calendar.DAY_OF_MONTH]
        ).show()

        showView()

        lbextension.visibility = View.GONE
        extensionDate.visibility = View.GONE

//        notify("IR regimen")

    }

    private fun irRegimentExtend() {
        showView()

        val dateFormat = SimpleDateFormat("dd-MMM-yyyy")
        val calendar = Calendar.getInstance()

        DatePickerDialog(
            this,
            {picker, year, month, day->
                val newCalendar = Calendar.getInstance()
                newCalendar.set(year,month,day)

                enrollDate.text = dateFormat.format(newCalendar.time)//Enrollment Date

                newCalendar.add(Calendar.DAY_OF_YEAR, 56)
                lbM2.text = "M2"
                m2Date.text = dateFormat.format(newCalendar.time)

                newCalendar.add(Calendar.DAY_OF_YEAR, 28)
                lbextension.text = "M3"
                lbextension.visibility = View.VISIBLE
                extensionDate.visibility = View.VISIBLE
                extensionDate.text = dateFormat.format(newCalendar.time)

                newCalendar.add(Calendar.DAY_OF_YEAR, 84)
                lbM5.text = "M6"
                m5Date.text = dateFormat.format(newCalendar.time)

                newCalendar.add(Calendar.DAY_OF_YEAR, 56)
                lbM6.text = "M8"
                m6Date.text = dateFormat.format(newCalendar.time)

            },
            calendar[Calendar.YEAR],
            calendar[Calendar.MONTH],
            calendar[Calendar.DAY_OF_YEAR]
        ).show()

//        notify("IR extended regimen")
    }

    private fun rrRegimen() {
        showView()
        val dateFormat = SimpleDateFormat("dd-MMM-yyyy")
        val calendar = Calendar.getInstance()

        DatePickerDialog(
            this,
            {picker, year, month, day->
                val newCalendar = Calendar.getInstance()
                newCalendar.set(year,month,day)

                enrollDate.text = dateFormat.format(newCalendar.time)//Enrollment Date

                newCalendar.add(Calendar.DAY_OF_YEAR, 84)
                lbM2.text = "M3"
                m2Date.text = dateFormat.format(newCalendar.time)

                newCalendar.add(Calendar.DAY_OF_YEAR, 56)
                lbM5.text = "M5"
                m5Date.text = dateFormat.format(newCalendar.time)

                newCalendar.add(Calendar.DAY_OF_YEAR, 84)
                lbM6.text = "M8"
                m6Date.text = dateFormat.format(newCalendar.time)

            },
            calendar[Calendar.YEAR],
            calendar[Calendar.MONTH],
            calendar[Calendar.DAY_OF_YEAR]
        ).show()

        lbextension.visibility = View.GONE
        extensionDate.visibility = View.GONE
//        notify("RR Regimen")
    }

    private fun rrRegimentExtend() {
        showView()

        val dateFormat = SimpleDateFormat("dd-MMM-yyyy")
        val calendar = Calendar.getInstance()

        DatePickerDialog(
            this,
            {picker, year, month, day->
                val newCalendar = Calendar.getInstance()
                newCalendar.set(year,month,day)

                enrollDate.text = dateFormat.format(newCalendar.time)//Enrollment Date

                newCalendar.add(Calendar.DAY_OF_YEAR, 84)
                lbM2.text = "M3"
                m2Date.text = dateFormat.format(newCalendar.time)

                newCalendar.add(Calendar.DAY_OF_YEAR, 28)
                lbextension.visibility = View.VISIBLE
                extensionDate.visibility = View.VISIBLE
                lbextension.text = "M4"
                extensionDate.text = dateFormat.format(newCalendar.time)

                newCalendar.add(Calendar.DAY_OF_YEAR, 56)
                lbM5.text = "M6"
                m5Date.text = dateFormat.format(newCalendar.time)

                newCalendar.add(Calendar.DAY_OF_YEAR, 84)
                lbM6.text = "M9"
                m6Date.text = dateFormat.format(newCalendar.time)

            },
            calendar[Calendar.YEAR],
            calendar[Calendar.MONTH],
            calendar[Calendar.DAY_OF_YEAR]
        ).show()

//        notify("RR Extended Regimen")
    }

    fun hideView() {
        lbM2.visibility = View.GONE
        m2Date.visibility = View.GONE
        lbM5.visibility = View.GONE
        m5Date.visibility = View.GONE
        lbM6.visibility = View.GONE
        m6Date.visibility = View.GONE
        lbextension.visibility = View.GONE
        extensionDate.visibility = View.GONE
    }

    fun showView() {
        lbM2.visibility = View.VISIBLE
        m2Date.visibility = View.VISIBLE
        lbM5.visibility = View.VISIBLE
        m5Date.visibility = View.VISIBLE
        lbM6.visibility = View.VISIBLE
        m6Date.visibility = View.VISIBLE
    }

    fun notify(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}