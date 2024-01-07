package creationalPatterns.factoryMethod.example_3.pizzaShop;

import creationalPatterns.factoryMethod.example_3.allAboutPizza.*;

public class PizzaShop_EU extends PizzaShop {
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        switch (type) {
            case MOZZARELLA -> pizza = new Mozzarella_EU();
            case BACON -> pizza = new Bacon_EU();
            case CHILI_PEPPER -> pizza = new Chili_Pepper_EU();
        }
        return pizza;
    }
}