package shapes;

import util.Input;

import static shapes.Circle.*;


public class CircleApp {
    public static Input input = new Input();

    // ---------------------------------------------------------------------------------------------------------
    // Not in use right now...
    // To ask for the specific name of a created Circle class object..
//    public static String askForCircleId() {
//        String circleId = input.getString("Enter the variable name for your circle: ");
//        return circleId;
//    }

    // Or getCircleId(), getCircleName(), circleIdentifier() methods in Circle class, not in use as well.

    // ---------------------------------------------------------------------------------------------------------

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
            Circle instanceCircle = new Circle(askForRadius());
            infoPrompts(instanceCircle.getRadius(), instanceCircle.getArea(), instanceCircle.getCircumference());
        } while (keepMakingCircles());
        System.out.println("\nTotal Circles created: " + Circle.getCirclesCreated()); // notice you are accessing a static method here, that method belongs to the Circle class, not an individual instanceCircle object !!! Because this is a static method, you use the Class name to access it.
    }


    /*
    Could you create an anonymous object and assign a reference variable name later??

        Because : getRadius( ) & getArea( ) & getCircumference( ) are instance methods, we have the instance variable name ( . ) dot, instance method.
        Because: getCirclesCreated( ) is a static method, we have the class name Circle ( . ) dot, static method.  Remember, static variables and methods belong to the class.

     */
}
