package creationalPatterns.factoryMethod.example_1;

import creationalPatterns.factoryMethod.example_1.factory.Dialog;
import creationalPatterns.factoryMethod.example_1.factory.HtmlDialog;
import creationalPatterns.factoryMethod.example_1.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}