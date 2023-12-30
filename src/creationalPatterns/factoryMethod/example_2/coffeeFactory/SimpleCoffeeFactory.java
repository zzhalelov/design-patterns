package creationalPatterns.factoryMethod.example_2.coffeeFactory;

import creationalPatterns.factoryMethod.example_2.aboutCoffee.*;

import static creationalPatterns.factoryMethod.example_2.aboutCoffee.CoffeeType.*;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new CaffeLatte();
                break;
        }

        return coffee;
    }
}