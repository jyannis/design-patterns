package Decorator.ConcreteComponent;

import Decorator.Component.Drink;
import Decorator.Decorator.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class MilkTea implements Drink {

    //奶茶的价钱
    private static final double cost = 11;

    //配料列表
    private List<String> ingredients = new ArrayList<String>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public double getCost() {
        return cost;
    }
}
