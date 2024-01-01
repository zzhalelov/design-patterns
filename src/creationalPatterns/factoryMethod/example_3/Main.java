package creationalPatterns.factoryMethod.example_3;

import creationalPatterns.factoryMethod.example_3.allAboutPizza.PizzaType;
import creationalPatterns.factoryMethod.example_3.pizzaShop.PizzaShop_EU;
import creationalPatterns.factoryMethod.example_3.pizzaShop.PizzaShop_US;

public class Main {
    public static void main(String[] args) {
        PizzaShop_EU pizzaShopEu = new PizzaShop_EU();
        pizzaShopEu.orderPizza(PizzaType.MOZZARELLA);
        PizzaShop_US pizzaShopUs = new PizzaShop_US();
        pizzaShopUs.orderPizza(PizzaType.BACON);
    }
}