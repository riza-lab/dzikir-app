package com.example.doadandzikir.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikir.R
import com.example.doadandzikir.adapter.DzikirDoaAdapter
import com.example.doadandzikir.model.DataDzikirDoa
import com.example.doadandzikir.model.DzikirDoa

class DzikirPagiActivity : AppCompatActivity() {

    private lateinit var rvDzikirPagi: RecyclerView

    private var listDzikirPagi: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_pagi)

        rvDzikirPagi = findViewById(R.id.rv_dzikir_pagi)

        listDzikirPagi.clear()
        listDzikirPagi.addAll(DataDzikirDoa.listDzikirPagi)

        rvDzikirPagi.layoutManager = LinearLayoutManager(this)
        rvDzikirPagi.adapter = DzikirDoaAdapter(listDzikirPagi)
        rvDzikirPagi.setHasFixedSize(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}