package creationalPatterns.factoryMethod.example_2;

import creationalPatterns.factoryMethod.example_2.aboutCoffee.CoffeeType;
import creationalPatterns.factoryMethod.example_2.coffeeFactory.CoffeeShop;
import creationalPatterns.factoryMethod.example_2.coffeeFactory.SimpleAmericanCoffeeFactory;
import creationalPatterns.factoryMethod.example_2.coffeeFactory.SimpleItalianCoffeeFactory;

public class Main {
    public static void main(String[] args) {
        /*
            Закажем капучино в итальянском стиле:
            1. Создадим фабрику для приготовления итальянского кофе
            2. Создадим новую кофейню, передав ей в конструкторе фабрику итальянского кофе
            3. Закажем наш кофе
         */
        SimpleItalianCoffeeFactory italianCoffeeFactory = new SimpleItalianCoffeeFactory();
        CoffeeShop italianCoffeeShop = new CoffeeShop(italianCoffeeFactory);
        italianCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
        /*
            Закажем капучино в американском стиле
            1. Создадим фабрику для приготовления американского кофе
            2. Создадим новую кофейню, передав ей в конструкторе фабрику американского кофе
            3. Закажем наш кофе
         */
        SimpleAmericanCoffeeFactory americanCoffeeFactory = new SimpleAmericanCoffeeFactory();
        CoffeeShop americanCoffeeShop = new CoffeeShop(americanCoffeeFactory);
        americanCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
    }
}