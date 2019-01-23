package ru.lexcorp.autoscrollviewpager

import android.content.Context
import android.view.animation.Interpolator
import android.widget.Scroller

/**
 * CustomDurationScroller
 */
class CustomDurationScroller(context: Context, interpolator: Interpolator) : Scroller(context, interpolator) {

    private var scrollFactor = 1.0

    /**
     * Set the factor by which the duration will change
     */
    fun setScrollDurationFactor(scrollFactor: Double) {
        this.scrollFactor = scrollFactor
    }

    override fun startScroll(startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) {
        super.startScroll(startX, startY, dx, dy, (duration * scrollFactor).toInt())
    }
}