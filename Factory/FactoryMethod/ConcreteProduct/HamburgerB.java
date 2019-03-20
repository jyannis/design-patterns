package Factory.FactoryMethod.ConcreteProduct;


import Factory.FactoryMethod.AbstractProduct.Hamburger;

public class HamburgerB implements Hamburger {
    public void sellHamburger() {
        System.out.println("卖出了汉堡B");
    }
}
