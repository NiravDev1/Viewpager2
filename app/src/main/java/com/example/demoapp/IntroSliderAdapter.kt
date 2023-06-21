package com.example.demoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IntroSliderAdapter(private val introSlides: List<IntroSlide>) :
    RecyclerView.Adapter<IntroSliderAdapter.IntroSliderViewholder>() {

    inner class IntroSliderViewholder(view: View) : RecyclerView.ViewHolder(view) {
        private val titletv = view.findViewById<TextView>(R.id.tvTitle)
        private val subtitletv = view.findViewById<TextView>(R.id.tvSubTitle)

        fun bind(introSlide: IntroSlide) {
            titletv.text = introSlide.title
            subtitletv.text = introSlide.subtitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSliderViewholder {
        return IntroSliderViewholder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.slide_item_container, parent, false)

        )
    }

    override fun getItemCount(): Int {
        return introSlides.size
    }

    override fun onBindViewHolder(holder: IntroSliderViewholder, position: Int) {
        holder.bind(introSlides[position])

    }
}