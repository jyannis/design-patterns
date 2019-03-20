package Factory.AbstractFactory.ConcreteProduct;

import Factory.AbstractFactory.AbstractProduct.Drink;

public class DrinkB implements Drink {
    public void sellDrink() {
        System.out.println("卖出了饮料B");
    }
}
