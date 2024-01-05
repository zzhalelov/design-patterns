package structuralPatterns.decorator.example_2;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Я треугольник!");
    }
}