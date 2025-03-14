package com.example.kevin_araneda_20250313_s8

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ImagenAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        adapter = ImagenAdapter(getImages())
        recyclerView.adapter = adapter
    }

    private fun getImages(): List<Int> {
        return listOf(
            R.drawable.imagen1,
            R.drawable.imagen2,
            R.drawable.imagen3,
            R.drawable.imagen4
        )
    }
}