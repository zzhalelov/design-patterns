package structuralPatterns.decorator.example_3;

public abstract class ShapeDecorator implements Shape {
    public Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}