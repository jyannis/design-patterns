package Decorator.ConcreteDecorator;

import Decorator.Component.Drink;
import Decorator.Decorator.Ingredient;

import java.util.List;

public class Coconut implements Ingredient {

    private Drink drink;

    //椰果的价钱
    private static final double cost = 2.5;

    public Coconut(Drink drink){
        this.drink = drink;
    }

    public List<String> getIngredients() {
        List<String> ingredients = drink.getIngredients();
        ingredients.add("Coconut");
        return ingredients;
    }

    public double getCost() {
        return drink.getCost() + cost;
    }
}
