package io.michael_bailey.gymlogbook.models.interfaces

import java.util.Date

interface IGymActivity {
    fun getExercise(): IGymExercise
    fun getEffectiveWeight(): Int
    fun getDate(): Date
}