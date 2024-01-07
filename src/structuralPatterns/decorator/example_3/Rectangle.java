package structuralPatterns.decorator.example_3;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Я прямоугольник");
    }
}