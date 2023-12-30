package creationalPatterns.factoryMethod.example_2.coffeeFactory;

import creationalPatterns.factoryMethod.example_2.aboutCoffee.Coffee;
import creationalPatterns.factoryMethod.example_2.aboutCoffee.CoffeeType;

public class CoffeeShop {
    private final SimpleCoffeeFactory coffeeFactory;

    public CoffeeShop(SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();
        System.out.println("Вот ваш кофе! Спасибо, приходите ещё!");
        return coffee;
    }
}