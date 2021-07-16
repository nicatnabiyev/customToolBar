package com.nicatnabiyev88.mymaterialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myToolbar = (toolbar as Toolbar)
        //setSupportActionBar(myToolbar)
        //supportActionBar?.title = "Nice"
        //supportActionBar?.subtitle = "You did great my friend"
        myToolbar.title = "Nice"
        myToolbar.subtitle = "You did great my friend"
        myToolbar.setNavigationIcon(R.drawable.back)
        myToolbar.setLogo(R.drawable.logo)

        myToolbar.inflateMenu(R.menu.menu_main)
        myToolbar.setOnMenuItemClickListener(Toolbar.OnMenuItemClickListener {
            var message = ""
            when(it.itemId){
                R.id.delete -> message = "delete"
                R.id.search -> message = "search"
                R.id.settings -> message = "settings"
                R.id.edit -> message = "edit"
                R.id.exit -> message = "exit"
            }
            Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
            true
        })
    }

    /*
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var message = ""
        when(item.itemId){
            R.id.delete -> message = "delete"
            R.id.search -> message = "search"
            R.id.settings -> message = "settings"
            R.id.edit -> message = "edit"
            R.id.exit -> message = "exit"
        }
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
        return super.onOptionsItemSelected(item)
    }
    */
}