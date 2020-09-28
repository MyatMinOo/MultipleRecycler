package com.mmm.mm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_search_donor.*

class search_donor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_donor)
        registerForContextMenu(btn_city)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.setHeaderTitle("Choose your City")
        menu?.add(0,v!!.id,0,"Yangon")
        menu?.add(0,v!!.id,0,"Pyay")
        menu?.add(0,v!!.id,0,"Mandalay")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if(item.title=="Yangon")
        {
            btn_blood.isInvisible=true
        }
        return true
    }
}