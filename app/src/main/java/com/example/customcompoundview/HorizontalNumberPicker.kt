package com.example.customcompoundview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView

class HorizontalNumberPicker @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    private var counter = 0

    init{
        // get the inflater service from the android system
//        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//
//        // inflate the layout into "this" component
//        inflater.inflate(R.layout.horizontal_number_picker, this)
        /** -------------------------------------------- **/
        val view = LayoutInflater.from(context).inflate(
            R.layout.horizontal_number_picker,
            this
        )
        setupUI(view)
    }

    private fun setupUI(view: View) {
        view.findViewById<Button>(R.id.btn_minus).setOnClickListener {
            decreaseCounter()
            updateDisplay(view)
        }
        view.findViewById<Button>(R.id.btn_plus).setOnClickListener {
            increaseCounter()
            updateDisplay(view)
        }
    }

    private fun updateDisplay(view: View) {
        view.findViewById<TextView>(R.id.edit_text).text = counter.toString()
    }

    private fun increaseCounter() {
        counter++
    }

    private fun decreaseCounter() {
        counter--
    }

}