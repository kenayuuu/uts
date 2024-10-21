package com.niken.uts

import AdapterMakanan
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.niken.uts.model.ModelMakanan

class Makanan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val items = listOf(
            ModelMakanan("Chicken Curry", "Delicious spicy chicken curry.", R.drawable.img_11),
            ModelMakanan("Chicken Burger", "Tasty chicken burger with fresh vegetables.", R.drawable.img_6),
            ModelMakanan("Broccoli Lasagna", "Healthy broccoli lasagna.", R.drawable.img_7),
            ModelMakanan("Mexican Appetizer", "Mexican style nachos with dips.", R.drawable.img_8),
            ModelMakanan("Broccoli Lasagna", "Another healthy broccoli lasagna.", R.drawable.img_9),
            ModelMakanan("Broccoli Lasagna", "Yet another version of broccoli lasagna.", R.drawable.img_10)
        )

        val adapter = AdapterMakanan(items)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}
