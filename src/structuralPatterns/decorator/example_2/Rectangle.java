package structuralPatterns.decorator.example_2;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Я прямоугольник!");
    }
}