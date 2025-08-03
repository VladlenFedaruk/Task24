package com.example.task24

class Task2 {
}

open class Bird {
    open fun clickBeak(): String {
        return ("")
    }
}

interface flyBird {
    fun fly(): String
}

class Ostrich : Bird() {
    override fun clickBeak(): String {
        return ("click beak")
    }
}

class Tomtit : Bird(), flyBird {
    override fun clickBeak(): String {
        return ("click beak")
    }

    override fun fly(): String {
        return ("Fly Fly Fly")
    }

}

fun letBirdClick(bird: Bird):String {
  return bird.clickBeak()
}





