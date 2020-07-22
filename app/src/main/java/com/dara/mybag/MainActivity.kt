package com.dara.mybag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_product.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_item_product)

        setupImagesRecyclerView()
    }

    private fun setupImagesRecyclerView() {
        val images = listOf(R.drawable.img_watch, R.drawable.img_watch, R.drawable.img_watch)
        val productImageAdapter = ProductImageAdapter(images)
        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rv_product_images.apply {
            adapter = productImageAdapter
            layoutManager = linearLayoutManager
        }
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rv_product_images)
        indicator.attachToRecyclerView(rv_product_images)
    }
}