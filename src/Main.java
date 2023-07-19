import cor.InfoLogprocessor;
import cor.LogProcessor;
import cor.NotFoundLogProcessor;
import cor.NullPointLogProcessor;
import factory.shape.Shape;
import factory.ShapeFactory;
import singleton.Singleton;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static class MallardDuck extends duck.Duck {
//        public MallardDuck() {
//            quackBehaviour = new MuteQuack();
//            flyBehaviour = new FlyWIthWings();
//            quackBehaviour = new Squeak();
//        }
//    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Decorator Design Pattern
        // BasePizza basePizza = new Mushrooms(new ExtraCheese(new OliveOil(new VegLoaded())));
        // System.out.println("Total Cost");
        // System.out.println(basePizza.cost());

        // Factory Design Pattern
        // System.out.println("Enter Shape");
        // Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();
        // ShapeFactory shapeFactory = new ShapeFactory();
        // Shape shape = shapeFactory.getShape(input);
        // shape.draw();

        // Chain Of Responsibility
        // LogProcessor logProcessor = new InfoLogprocessor(new NotFoundLogProcessor(new NullPointLogProcessor(null)));
        // logProcessor.log(LogProcessor.NULL_POINT, "Null Pointer ");
        // logProcessor.log(LogProcessor.NOT_FOUND, "Not Found");
        // logProcessor.log(LogProcessor.INFO, "Info");

        // Singleton
        // Singleton.getInstance("Here is example of singleton design pattern");
    }
}