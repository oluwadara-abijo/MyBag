package com.dara.mybag

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dara.mybag.MainActivity.Companion.products
import kotlinx.android.synthetic.main.activity_checkout.*

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        img_back.setOnClickListener { super.onBackPressed() }

        setupProductsRecyclerView()

    }

    private fun setupProductsRecyclerView() {
        val productImageAdapter = ProductAdapter(products)
        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rv_products.apply {
            adapter = productImageAdapter
            layoutManager = linearLayoutManager
        }
    }
}