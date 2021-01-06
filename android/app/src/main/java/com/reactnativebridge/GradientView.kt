package com.reactnativebridge

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.ScaleDrawable
import android.util.AttributeSet
import android.view.Gravity
import android.view.View

class GradientView : View {
    private var cornerRadius = 0f
    private var fromColor = "#ffffff"
    private var toColor = "#ffffff"


    constructor(context: Context?) : super(context) {
    }


    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    private fun initUi() {
        val gradient = GradientDrawable()
        gradient.colors = intArrayOf(
                Color.parseColor(fromColor),
                Color.parseColor(toColor)
        )
        gradient.orientation = GradientDrawable.Orientation.TOP_BOTTOM
        gradient.gradientType = GradientDrawable.LINEAR_GRADIENT
        gradient.shape = GradientDrawable.RECTANGLE
        gradient.cornerRadius = cornerRadius

        this.background = gradient
    }



    fun setCornerRadius(cornerRadius: Float) {
        this.cornerRadius = cornerRadius
        initUi()
    }

    fun setFromColor(fromColor: String) {
        this.fromColor = fromColor
        initUi()

    }


    fun setToColor(toColor: String) {
        this.toColor = toColor
        initUi()

    }
}