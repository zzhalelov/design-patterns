package structuralPatterns.decorator.example_3;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Я круг!");
    }
}