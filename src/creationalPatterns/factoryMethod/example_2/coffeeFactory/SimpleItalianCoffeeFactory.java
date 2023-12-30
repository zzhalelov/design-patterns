package creationalPatterns.factoryMethod.example_2.coffeeFactory;

import creationalPatterns.factoryMethod.example_2.aboutCoffee.*;

public class SimpleItalianCoffeeFactory extends SimpleCoffeeFactory {
    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new ItalianStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new ItalianStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}