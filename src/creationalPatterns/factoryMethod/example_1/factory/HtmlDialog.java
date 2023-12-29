package creationalPatterns.factoryMethod.example_1.factory;

import creationalPatterns.factoryMethod.example_1.buttons.Button;
import creationalPatterns.factoryMethod.example_1.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}