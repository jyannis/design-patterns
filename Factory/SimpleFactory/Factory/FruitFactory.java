package Factory.SimpleFactory.Factory;

import Factory.SimpleFactory.AbstractProduct.Fruit;
import Factory.SimpleFactory.ConcreteProduct.Apple;
import Factory.SimpleFactory.ConcreteProduct.Pear;

public class FruitFactory {

    public Fruit produce(String fruitName){
        if("apple".equals(fruitName)){
            return new Apple();
        }else if("pear".equals(fruitName)){
            return new Pear();
        }else {
            return null;
        }
    }

}
