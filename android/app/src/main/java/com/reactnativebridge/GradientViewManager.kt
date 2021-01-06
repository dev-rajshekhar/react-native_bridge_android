package com.reactnativebridge

import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

class GradientViewManager : SimpleViewManager<GradientView>() {
    override fun getName(): String {
        return "GradientView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): GradientView {
        return GradientView(reactContext)
    }

    @ReactProp(name = "toColor")
    fun setToColor(switchView: GradientView, toColor: String) {
        switchView.setToColor(toColor)

    }

    @ReactProp(name = "fromColor")
    fun setFromColor(switchView: GradientView, color: String) {
        switchView.setFromColor(color)
    }

    @ReactProp(name = "cornerRadius")
    fun setCornerRadius(switchView: GradientView, cornerRadius: Float) {
        switchView.setCornerRadius(cornerRadius)
    }


}