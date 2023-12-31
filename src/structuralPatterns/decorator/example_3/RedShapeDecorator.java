package structuralPatterns.decorator.example_3;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder(decoratedShape);
    }

    public void setBorder(Shape decoratedShape) {
        System.out.println("Цвет границы - красный");
    }
}