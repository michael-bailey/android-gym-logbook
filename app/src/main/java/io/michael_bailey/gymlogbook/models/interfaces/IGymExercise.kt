package io.michael_bailey.gymlogbook.models.interfaces

interface IGymExercise {
     fun calcWeight(actorWeight: Int, applianceWeight: Int)
     fun getName(): String
}