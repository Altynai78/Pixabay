package com.example.pixabay

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView

class PixaAdapter (val list: ArrayList<PixaModel.ImageModel>) :
    Adapter<PixaAdapter.PixaViewHolder>() {

        fun addImages(listImages: ArrayList<PixaModel.ImageModel>) {
            list.addAll(listImages)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PixaViewHolder {
            return PixaViewHolder(
                ItemImageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }

        override fun onBindViewHolder(holder: PixaViewHolder, position: Int) {
            holder.bind(list[position])
        }

        override fun getItemCount(): Int {
            return list.size
        }


        class PixaViewHolder(var binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(imageModel: PixaModel.ImageModel) {
                binding.photoView.load(imageModel.largeImageURL)
            }
        }
    }
