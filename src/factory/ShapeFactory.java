package factory;

import factory.shape.Circle;
import factory.shape.Rectangle;
import factory.shape.Shape;
import factory.shape.Square;

public class ShapeFactory {
    public Shape getShape(String input) {
        return switch (input) {
            case "Rectangle" -> new Rectangle();
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}
