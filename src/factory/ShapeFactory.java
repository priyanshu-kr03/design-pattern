package factory;

import factory.shape.*;

public class ShapeFactory {
    public Shape getShape(String input) {
        return switch (input) {
            case "Rectangle" -> new Rectangle();
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> new  NullShape();
        };
    }
}
