package Decorator;

import Decorator.Component.Drink;
import Decorator.ConcreteComponent.Coffee;
import Decorator.ConcreteComponent.MilkTea;
import Decorator.ConcreteDecorator.Coconut;
import Decorator.ConcreteDecorator.Pearl;
import Decorator.ConcreteDecorator.Sugar;

public class Test {

    public static void main(String[] args) {
        Drink drink = new MilkTea();
        drink = new Coconut(drink);
        drink = new Pearl(drink);

        System.out.println("这杯奶茶的配料有：");
        for(String ingredient:drink.getIngredients()){
            System.out.println("    " + ingredient);
        }

        System.out.println("这杯奶茶的价钱为：");
        System.out.println("    " + drink.getCost());

        System.out.println();
        System.out.println("----------分隔符----------");
        System.out.println();

        Drink drink1 = new Coffee();
        drink1 = new Sugar(drink1);
        drink1 = new Sugar(drink1);

        System.out.println("这杯咖啡的配料有：");
        for(String ingredient:drink1.getIngredients()){
            System.out.println("    " + ingredient);
        }

        System.out.println("这杯咖啡的价钱为：");
        System.out.println("    " + drink1.getCost());
    }
}
