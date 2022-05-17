package com.example.saveit

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    private val tipos = arrayOf("Supermercado", "Restaurantes", "Papeleria", "Videojuegos")

    class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {
        private var tipo: String = ""
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            if (parent != null) {
                this.tipo = parent.getItemAtPosition(position) as String
            }
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
            TODO("Not yet implemented")
        }
    }


    fun setSpinner(){
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, tipos)
        val mySpinner: Spinner= findViewById(R.id.myspinner);
        mySpinner.adapter = adapter;
        mySpinner.onItemSelectedListener  = SpinnerActivity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSpinner()
    }
}