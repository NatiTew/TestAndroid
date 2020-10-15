package com.example.testandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val items = ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add("hello")
        items.add("bye")

        adapter = ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                items)
        itemListView.adapter = adapter
    }

    fun saveButton(view: View) {
        //แบบที่1
        // val textView:TextView  = findViewById(R.id.text_view)
        //textView.text = "Good bye See you"
        //แบบที่2
        //text_view.text = "Good Byeeeee"
        val msg = itemEditText.text.toString()
        itemEditText.text.clear()
//        Toast.makeText(this,
//                msg,
//                Toast.LENGTH_LONG).show()
        items.add(msg)
        //ถ้าใส่? ถ้าเป็นnull โปรแกรมจะผ่านไป
        adapter?.notifyDataSetChanged()
        //ถ้าใส่!! ถ้าเป็นNull โปรแกรมแคช
        //adapter!!.notifyDataSetChanged()

        //adapter.add()
    }

}