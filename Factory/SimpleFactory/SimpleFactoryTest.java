package Factory.SimpleFactory;

import Factory.SimpleFactory.AbstractProduct.Fruit;
import Factory.SimpleFactory.Factory.FruitFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruit = fruitFactory.produce("apple");
        fruit.sellFruit();
    }

}
