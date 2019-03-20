package Factory.AbstractFactory.ConcreteProduct;

import Factory.AbstractFactory.AbstractProduct.Drink;

public class DrinkA implements Drink{
    public void sellDrink() {
        System.out.println("卖出了饮料A");
    }
}
