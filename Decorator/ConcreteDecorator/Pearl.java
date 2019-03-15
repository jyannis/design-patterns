package Decorator.ConcreteDecorator;

import Decorator.Component.Drink;
import Decorator.Decorator.Ingredient;

import java.util.List;

public class Pearl implements Ingredient {

    private Drink drink;

    //珍珠的价钱
    private static final double cost = 2;

    public Pearl(Drink drink){
        this.drink = drink;
    }

    public List<String> getIngredients() {
        List<String> ingredients = drink.getIngredients();
        ingredients.add("Pearl");
        return ingredients;
    }

    public double getCost() {
        return drink.getCost() + cost;
    }

}
