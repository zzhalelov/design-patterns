package structuralPatterns.decorator.example_2;

public class Main {
    //Декоратор — это структурный паттерн проектирования, который позволяет динамически добавлять объектам новую функциональность,
    // оборачивая их в полезные «обёртки».
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redTriangle = new RedShapeDecorator(new Triangle());

        System.out.println("\nОбычный круг:");
        circle.draw();

        System.out.println("\nКруг с красной границей:");
        redCircle.draw();

        System.out.println("\nПрямоугольник с красной границей:");
        redRectangle.draw();

        System.out.println("\nТреугольник с красной границей:");
        redTriangle.draw();
    }
}