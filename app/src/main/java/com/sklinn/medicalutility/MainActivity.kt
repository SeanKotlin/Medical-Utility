package com.sklinn.medicalutility

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.sklinn.medicalutility.Model.Data

class MainActivity : AppCompatActivity() {

    internal var expandableListView: ExpandableListView? = null
    internal var adapter: ExpandableListAdapter? = null
    internal var titleList: List<String>? = null

    var data = Data().getlistData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expandableListView = findViewById(R.id.expandableListView)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        if (expandableListView != null) {
            val listData = data  //assign data as listData
            titleList = ArrayList(listData.keys)
            adapter = CustomExpandableListAdapter(this, titleList as ArrayList<String>, listData)
            expandableListView!!.setAdapter(adapter)

//            expandableListView!!.setOnGroupExpandListener { groupPosition ->
//                Toast.makeText(
//                    applicationContext,
//                    (titleList as ArrayList<String>)[groupPosition] + " List Expanded.",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }

//            expandableListView!!.setOnGroupCollapseListener { groupPosition ->
//                Toast.makeText(
//                    applicationContext,
//                    (titleList as ArrayList<String>)[groupPosition] + " List Collapsed.",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }

            expandableListView!!.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
                val title = listData[(titleList as ArrayList<String>)[groupPosition]]!!.get(childPosition)
                val intent = ResultActivity.newIntent(applicationContext,groupPosition,childPosition, title)
                startActivity(intent)
                false
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.tbdate -> startActivity(Intent(this,TBDateActivity::class.java))
            R.id.logout -> finishAffinity()
        }
        return super.onOptionsItemSelected(item)
    }

}
