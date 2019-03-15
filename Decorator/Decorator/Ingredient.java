package Decorator.Decorator;

import Decorator.Component.Drink;

import java.util.List;

public interface Ingredient extends Drink {

    //配料列表
    List<String> getIngredients();

    //价钱
    double getCost();

}
