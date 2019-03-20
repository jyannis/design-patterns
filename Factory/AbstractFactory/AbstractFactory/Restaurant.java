package Factory.AbstractFactory.AbstractFactory;

import Factory.AbstractFactory.AbstractProduct.Drink;
import Factory.AbstractFactory.AbstractProduct.Hamburger;

public interface Restaurant {

    Hamburger produceHamburger();

    Drink produceDrink();

}
