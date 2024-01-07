package structuralPatterns.decorator.example_3;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
    }
}