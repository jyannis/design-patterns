package Decorator.Component;

import java.util.List;

public interface Drink {

    //配料列表
    List<String> getIngredients();

    //价钱
    double getCost();

}
