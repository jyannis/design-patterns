package Factory.FactoryMethod.ConcreteFactory;

import Factory.FactoryMethod.AbstractFactory.HamburgerFactory;
import Factory.FactoryMethod.AbstractProduct.Hamburger;
import Factory.FactoryMethod.ConcreteProduct.HamburgerA;

public class HamburgerAFactory implements HamburgerFactory {
    public Hamburger produce() {
        return new HamburgerA();
    }
}
