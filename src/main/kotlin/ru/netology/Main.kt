package ru.netology

fun main () {

    val likes = 4

    val peopleOrPerson = if (likes % 10 === 1 && likes % 100 !== 11) "человеку" else "людям"
    println("Понравилось $likes $peopleOrPerson")

}