package Factory.FactoryMethod;


import Factory.FactoryMethod.AbstractFactory.HamburgerFactory;
import Factory.FactoryMethod.AbstractProduct.Hamburger;

public class FactoryMethodTest {

    private static String prefix = "Factory.FactoryMethod.ConcreteFactory.";
    private static String factoryName = "HamburgerAFactory";

    public static void main(String[] args) throws Exception {
        HamburgerFactory hamburgerFactory = (HamburgerFactory) Class.forName(prefix + factoryName).getDeclaredConstructor().newInstance();
        Hamburger hamburger = hamburgerFactory.produce();
        hamburger.sellHamburger();
    }

}
