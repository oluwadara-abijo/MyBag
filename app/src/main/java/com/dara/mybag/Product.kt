package com.dara.mybag

data class Product(
    val images: List<Int>,
    val name: String,
    val amount: String,
    val reference: String,
    val description: String,
    val isFavourite: Boolean,
    val features: List<Feature>
)

data class Feature(val image: Int, val name: String)