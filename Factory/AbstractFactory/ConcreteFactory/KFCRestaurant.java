package Factory.AbstractFactory.ConcreteFactory;

import Factory.AbstractFactory.AbstractFactory.Restaurant;
import Factory.AbstractFactory.AbstractProduct.Drink;
import Factory.AbstractFactory.AbstractProduct.Hamburger;
import Factory.AbstractFactory.ConcreteProduct.DrinkA;
import Factory.AbstractFactory.ConcreteProduct.HamburgerA;

public class KFCRestaurant implements Restaurant {
    public Hamburger produceHamburger() {
        return new HamburgerA();
    }

    public Drink produceDrink() {
        return new DrinkA();
    }
}
