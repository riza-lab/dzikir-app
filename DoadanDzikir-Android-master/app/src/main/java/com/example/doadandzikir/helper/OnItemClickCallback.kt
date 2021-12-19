package com.example.doadandzikir.helper

import com.example.doadandzikir.model.Artikel

interface OnItemClickCallback {
    fun onItemClicked(data: Artikel)
}