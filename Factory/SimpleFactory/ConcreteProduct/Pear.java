package Factory.SimpleFactory.ConcreteProduct;

import Factory.SimpleFactory.AbstractProduct.Fruit;

public class Pear implements Fruit {
    public void sellFruit() {
        System.out.println("卖出了梨");
    }
}
