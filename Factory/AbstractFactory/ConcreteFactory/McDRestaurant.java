package Factory.AbstractFactory.ConcreteFactory;

import Factory.AbstractFactory.AbstractFactory.Restaurant;
import Factory.AbstractFactory.AbstractProduct.Drink;
import Factory.AbstractFactory.AbstractProduct.Hamburger;
import Factory.AbstractFactory.ConcreteProduct.DrinkB;
import Factory.AbstractFactory.ConcreteProduct.HamburgerB;

public class McDRestaurant implements Restaurant {
    public Hamburger produceHamburger() {
        return new HamburgerB();
    }

    public Drink produceDrink() {
        return new DrinkB();
    }
}
