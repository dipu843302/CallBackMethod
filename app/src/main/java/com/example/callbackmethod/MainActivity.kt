package com.example.callbackmethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ClickListener {
    var arrayList = ArrayList<String>()
    lateinit var dataAdapter: DataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (i in 0..5) {
            arrayList.add("Jeno")
            arrayList.add("Bharthi")
            arrayList.add("Simon")
            arrayList.add("Diyanthan")
            arrayList.add("Nalinikanta")
            arrayList.add("Mukesh")
            arrayList.add("Dhiraj")
            arrayList.add("Poornima")
        }
        setRecyclerView()
    }

    private fun setRecyclerView() {
        dataAdapter = DataAdapter(arrayList, this)
        recyclerView.adapter = dataAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }

    override fun onClick(name: String) {
        Toast.makeText(this, "$name", Toast.LENGTH_SHORT).show()
    }


}