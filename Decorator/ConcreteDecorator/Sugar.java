package Decorator.ConcreteDecorator;

import Decorator.Component.Drink;
import Decorator.Decorator.Ingredient;

import java.util.List;

public class Sugar implements Ingredient {

    private Drink drink;

    //糖的价钱
    private static final double cost = 0.5;

    public Sugar(Drink drink){
        this.drink = drink;
    }

    public List<String> getIngredients() {
        List<String> ingredients = drink.getIngredients();
        ingredients.add("Sugar");
        return ingredients;
    }

    public double getCost() {
        return drink.getCost() + cost;
    }
}
