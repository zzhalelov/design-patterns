package creationalPatterns.factoryMethod.example_1.factory;

import creationalPatterns.factoryMethod.example_1.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}