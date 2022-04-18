package com.example.customcompoundview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

class HorizontalNumberPicker @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init{
        // get the inflater service from the android system
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        // inflate the layout into "this" component
        inflater.inflate(R.layout.horizontal_number_picker, this)


    }

}