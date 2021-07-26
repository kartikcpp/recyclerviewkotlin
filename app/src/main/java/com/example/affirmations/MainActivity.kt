package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.data.Datasource;
import com.example.affirmations.models.ItemAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val l=Datasource().loadAffirmations()
        val recyclerview=findViewById<RecyclerView>(R.id.recycler_view)
        recyclerview.adapter=ItemAdapter(this,l)

    }
}