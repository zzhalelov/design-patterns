package creationalPatterns.factoryMethod.example_1.factory;

import creationalPatterns.factoryMethod.example_1.buttons.Button;
import creationalPatterns.factoryMethod.example_1.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}