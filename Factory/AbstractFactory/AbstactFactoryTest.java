package Factory.AbstractFactory;

import Factory.AbstractFactory.AbstractFactory.Restaurant;
import Factory.AbstractFactory.AbstractProduct.Drink;
import Factory.AbstractFactory.AbstractProduct.Hamburger;
import Factory.AbstractFactory.ConcreteFactory.KFCRestaurant;
import Factory.AbstractFactory.ConcreteFactory.McDRestaurant;

public class AbstactFactoryTest {

    private static String prefix = "Factory.AbstractFactory.ConcreteFactory.";
    private static String factoryName = "KFCRestaurant";

    public static void main(String[] args) throws Exception{
        Restaurant restaurant = (Restaurant) Class.forName(prefix + factoryName).getDeclaredConstructor().newInstance();
        Hamburger hamburger = restaurant.produceHamburger();
        hamburger.sellHamburger();
        Drink drink = restaurant.produceDrink();
        drink.sellDrink();
        System.out.println("----分割线----");
        factoryName = "McDRestaurant";
        restaurant = (Restaurant) Class.forName(prefix + factoryName).getDeclaredConstructor().newInstance();
        hamburger = restaurant.produceHamburger();
        hamburger.sellHamburger();
        drink = restaurant.produceDrink();
        drink.sellDrink();
    }

}
