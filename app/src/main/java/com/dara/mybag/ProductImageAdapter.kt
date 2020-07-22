package com.dara.mybag

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.dara.mybag.ProductImageAdapter.*

class ProductImageAdapter(private var imageIds: List<Int>) :
    RecyclerView.Adapter<ImageViewHolder>() {

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(image: Int) {
            itemView.findViewById<ImageView>(R.id.img_image).setImageResource(image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item_product_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imageIds.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val currentImage = imageIds[position]
        holder.bind(currentImage)
    }
}