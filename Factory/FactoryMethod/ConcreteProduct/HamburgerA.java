package Factory.FactoryMethod.ConcreteProduct;


import Factory.FactoryMethod.AbstractProduct.Hamburger;

public class HamburgerA implements Hamburger {
    public void sellHamburger() {
        System.out.println("卖出了汉堡A");
    }
}
