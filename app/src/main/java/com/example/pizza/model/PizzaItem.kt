package com.example.pizza.model

class PizzaItem {
    var imagePizza : Int
    var titlePizza : String
    var costPizza : Int
    var descriptionPizza: String

    constructor(imagePizza: Int, titlePizza: String, costPizza: Int, descriptionPizza: String) {
        this.imagePizza = imagePizza
        this.titlePizza = titlePizza
        this.costPizza = costPizza
        this.descriptionPizza = descriptionPizza
    }
}