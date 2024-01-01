package creationalPatterns.factoryMethod.example_3.pizzaShop;

import creationalPatterns.factoryMethod.example_3.allAboutPizza.*;

public class PizzaShop_US extends PizzaShop {
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        switch (type) {
            case MOZZARELLA -> pizza = new Mozzarella_US();
            case BACON -> pizza = new Bacon_US();
            case CHILI_PEPPER -> pizza = new Chili_Pepper_US();
        }
        return pizza;
    }
}