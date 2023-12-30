package creationalPatterns.factoryMethod.example_2.coffeeFactory;

import creationalPatterns.factoryMethod.example_2.aboutCoffee.Coffee;
import creationalPatterns.factoryMethod.example_2.aboutCoffee.CoffeeType;

public abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите ещё!");
        return coffee;
    }

    protected abstract Coffee createCoffee(CoffeeType type);
}