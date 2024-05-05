import builder.Student;
import command.Invoker;
import command.commands.LightOffCommand;
import command.commands.LightOnCommand;
import command.receiver.Light;
import cor.InfoLogprocessor;
import cor.LogProcessor;
import cor.NotFoundLogProcessor;
import cor.NullPointLogProcessor;
import decorator.pizza.BasePizza;
import decorator.pizza.VegLoaded;
import decorator.toppings.ExtraCheese;
import decorator.toppings.Mushrooms;
import decorator.toppings.OliveOil;
import factory.shape.Shape;
import factory.ShapeFactory;
import singleton.Singleton;
import strategy.driveStrategy.OffRoadStrategy;
import strategy.driveStrategy.SportsCarStrategy;
import strategy.vehicle.SportsCar;
import strategy.vehicle.Thar;
import strategy.vehicle.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        /* -------------------------------- Decorator Design Pattern ---------------------------------------------- */
        /*  BasePizza basePizza = new Mushrooms(new ExtraCheese(new OliveOil(new VegLoaded())));
         System.out.println("Total Cost");
         System.out.println(basePizza.cost()); */

        /* --------------------------------- Factory Design Pattern ----------------------------------------------- */
         /*System.out.println("Enter Shape");
         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
         ShapeFactory shapeFactory = new ShapeFactory();
         Shape shape = shapeFactory.getShape(input);
         shape.draw();*/

        /* -------------------------------- Chain Of Responsibility ----------------------------------------------- */
         /*LogProcessor logProcessor = new InfoLogprocessor(new NotFoundLogProcessor(new NullPointLogProcessor(null)));
         logProcessor.log(LogProcessor.NULL_POINT, "Null Pointer ");
         logProcessor.log(LogProcessor.NOT_FOUND, "Not Found");
         logProcessor.log(LogProcessor.INFO, "Info"); */

         /* --------------------------------Singleton-------------------------------------------------------------- */
        /* Singleton.getInstance("Here is example of singleton design pattern");/*

        /* -------------------------------- Command Design pattern--------------------------------------------------*/
        /* Invoker invoker = new Invoker();
        Light light=new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        invoker.setCommand(lightOnCommand);
        invoker.execute();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        invoker.setCommand(lightOffCommand);
        invoker.execute();*/

        /* -------------------------------- Strategy Design Pattern ------------------------------------------------- */
        // Suppose there is a two class B and C extending A. Now if both of them override a function from A.
        // And both functions are same. Ths is violating code usability. That's why we use strategy design pattern
        /* Vehicle vehicle = new SportsCar(new SportsCarStrategy());
        vehicle.drive();
        Vehicle thar = new Thar(new OffRoadStrategy());
        thar.drive(); */

        /* ------------------------------------ NUll Object Pattern ------------------------------------------------- */
        // Problem - How to handle null value
        /* Added a NUllShape in factory design pattern if input is wrong then default behaviour will be returned*/

        /* ------------------------------------ Builder Design Pattern ----------------------------------------------- */
        Student student = Student.builder().setFathersName("M.k.Ojha").setName("Priyanshu").setRoll(2).setStream("PCM").build();
        System.out.println(student.getName()+ "\n"+ student.getFathersName()+ "\n"+ student.getRoll()+ "\n"+ student.getStream());

    }
}