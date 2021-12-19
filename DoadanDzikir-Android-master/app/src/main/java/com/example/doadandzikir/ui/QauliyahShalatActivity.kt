package com.example.doadandzikir.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikir.R
import com.example.doadandzikir.adapter.DzikirDoaAdapter
import com.example.doadandzikir.model.DataDzikirDoa
import com.example.doadandzikir.model.DzikirDoa

class QauliyahShalatActivity : AppCompatActivity() {

    private lateinit var rvQauliyah: RecyclerView
    private var listQauliyah: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setContentView(R.layout.activity_qauliyah_shalat)
        rvQauliyah = findViewById(R.id.rv_qauliyah_shalat)

        listQauliyah.clear()
        listQauliyah.addAll(DataDzikirDoa.listQauliyah)

        rvQauliyah.layoutManager = LinearLayoutManager(this)
        rvQauliyah.adapter = DzikirDoaAdapter(listQauliyah)
        rvQauliyah.setHasFixedSize(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}