package Factory.FactoryMethod.ConcreteFactory;

import Factory.FactoryMethod.AbstractFactory.HamburgerFactory;
import Factory.FactoryMethod.AbstractProduct.Hamburger;
import Factory.FactoryMethod.ConcreteProduct.HamburgerB;

public class HamburgerBFactory implements HamburgerFactory {
    public Hamburger produce() {
        return new HamburgerB();
    }
}
