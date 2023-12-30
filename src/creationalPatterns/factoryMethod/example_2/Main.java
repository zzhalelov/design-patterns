package creationalPatterns.factoryMethod.example_2;

import creationalPatterns.factoryMethod.example_2.aboutCoffee.CoffeeType;
import creationalPatterns.factoryMethod.example_2.coffeeFactory.*;

public class Main {
    public static void main(String[] args) {
        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
    }
}