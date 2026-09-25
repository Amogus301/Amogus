package com.example.amogus

class Circle(val x: Int, val y: Int, val radius: Float): Shape(x, y) {
    fun getRadius(): Float{
        return radius
    }
}