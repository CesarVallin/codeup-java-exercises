package shapes;

import util.Input;

public class CircleApp {
    public static Input input = new Input();

    public static double askForRadius() {
        double doublePrompt = input.getDouble("Please provide a radius to create a circle");
        return doublePrompt;
    }

    public static boolean keepMakingCircles() {
        boolean keepGoing = input.yesNo("Make another Circle? [y/N]");
        System.out.println(keepGoing);
        return keepGoing;
    }

    public static void createCircle() {

        do {
            Circle circle = new Circle(askForRadius());
            System.out.println("The radius of your circle is: " + circle.getRadius());
            System.out.println("The area of your circle is: " + circle.getArea());
            System.out.println("The circumference of you circle is: " + circle.getCircumference());
        } while (keepMakingCircles());
        System.out.println("Circles created: " + Circle.circlesCreated);
    }

//    public static void main(String[] args) {
////        createCircle();
//    }

}
