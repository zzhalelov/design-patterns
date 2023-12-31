package creationalPatterns.factoryMethod.example_3.pizzaShop;

import creationalPatterns.factoryMethod.example_3.allAboutPizza.Pizza;
import creationalPatterns.factoryMethod.example_3.allAboutPizza.PizzaType;

public abstract class PizzaShop {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.takeDough();
        pizza.addIngredients();
        pizza.bake();
        System.out.println("Bon Appetit!");
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}