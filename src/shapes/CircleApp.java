package shapes;

import util.Input;
import static shapes.Circle.getCirclesCreated;

public class CircleApp {
    public static Input input = new Input();

    public static double askForRadius() {
        double doublePrompt = input.getDouble("\nPlease provide a radius to create a circle");
        return doublePrompt;
    }
    public static boolean keepMakingCircles() {
        boolean keepGoing = input.yesNo("Make another Circle? [y/N]");
        System.out.println(keepGoing);
        return keepGoing;
    }
    public static void infoPrompts(double radius, double area, double circumference){
        System.out.println("The radius of your circle is: " + radius);
        System.out.println("The area of your circle is: " + area);
        System.out.println("The circumference of you circle is: " + circumference);
    }

    public static void createCircle() {

        do {
            Circle circle = new Circle(askForRadius());
            infoPrompts(circle.getRadius(), circle.getArea(), circle.getCircumference());
        } while (keepMakingCircles());
        System.out.println("\nCircles created: " + getCirclesCreated()); // Is it bc it is only a static reference?? meaning that we never create instances of `getCirclesCreated` ??
    }


    /*
       Static fields & methods belong to the Class itself, shared only within that class.  To access these fields and methods on another Class, you will have to import them.

       Instance fields & methods are public, meaning they can be accessed from another Class within the same package.

     */
}
