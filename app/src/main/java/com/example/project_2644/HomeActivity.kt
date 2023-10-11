package com.example.project_2644

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnFairy: Button = findViewById(R.id.buttonMenu1)

        btnFairy.setOnClickListener{
            val Intent = Intent(this,BookKidActivity::class.java)
            startActivity(Intent)
        }
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)

        rvBuku.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book4,"Emi's Beach Adventure",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book2,"Emi's Beach Adventure",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book2,"Emi's Beach Adventure",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book4,"Emi's Beach Adventure",
            "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))

        val adapter = AdapterHome(data)

        rvBuku.adapter = adapter
    }
}