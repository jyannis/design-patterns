package Factory.SimpleFactory.ConcreteProduct;

import Factory.SimpleFactory.AbstractProduct.Fruit;

public class Apple implements Fruit {
    public void sellFruit() {
        System.out.println("卖出了苹果");
    }
}
