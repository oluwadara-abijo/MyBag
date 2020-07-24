package com.dara.mybag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        lateinit var products: List<Product>
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        products = arrayListOf(
            Product(
                listOf(R.drawable.img_watch, R.drawable.img_watch, R.drawable.img_watch),
                "Tudor Black Bay",
                "$658.00",
                "m7904-1558",
                "Introduced at Baseworld 2017, this elegant sporty watch captures the " +
                        "essence of Black Bay watch in a more formal version",
                false,
                listOf(
                    Feature(R.drawable.ic_baseline_security_24, "5 year guarantee"),
                    Feature(R.drawable.ic_baseline_autorenew_24, "Automatic"),
                    Feature(R.drawable.ic_baseline_panorama_wide_angle_24, "41mm steel case"),
                    Feature(R.drawable.ic_baseline_local_drink_24, "Waterproof")
                )
            ),
            Product(
                listOf(R.drawable.img_watch, R.drawable.img_watch, R.drawable.img_watch),
                "Tudor Black Bay",
                "$658.00",
                "m7904-1558",
                "Introduced at Baseworld 2017, this elegant sporty watch captures the " +
                        "essence of Black Bay watch in a more formal version",
                false,
                listOf(
                    Feature(R.drawable.ic_baseline_security_24, "5 year guarantee"),
                    Feature(R.drawable.ic_baseline_autorenew_24, "Automatic"),
                    Feature(R.drawable.ic_baseline_panorama_wide_angle_24, "41mm steel case"),
                    Feature(R.drawable.ic_baseline_local_drink_24, "Waterproof")
                )
            )
        )

        populateUI()
        setupImagesRecyclerView()

        btn_add_to_bag.setOnClickListener {
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
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

    private fun populateUI(){
        val product = products[0]
        tv_product_name.text = product.name
        tv_product_reference.text =  product.reference
        tv_product_amount.text = product.amount
        tv_product_description.text = product.description
    }
}