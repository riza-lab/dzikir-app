package com.example.doadandzikir.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikir.R
import com.example.doadandzikir.adapter.DzikirDoaAdapter
import com.example.doadandzikir.model.DataDzikirDoa
import com.example.doadandzikir.model.DzikirDoa

class DzikirPetangActivity : AppCompatActivity() {

    private lateinit var rvDzikirPetang: RecyclerView

    private var listDzikirPetang: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_petang)

        rvDzikirPetang = findViewById(R.id.rv_dzikir_petang)

        listDzikirPetang.clear()
        listDzikirPetang.addAll(DataDzikirDoa.listDzikirPetang)

        rvDzikirPetang.layoutManager = LinearLayoutManager(this)
        rvDzikirPetang.adapter = DzikirDoaAdapter(listDzikirPetang)
        rvDzikirPetang.setHasFixedSize(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}