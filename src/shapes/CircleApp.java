package shapes;

import util.Input;

public class CircleApp {
    public static Input input = new Input();

    public static double askForRadius() {
        double doublePrompt = input.getDouble("Please provide a radius to create a circle");
        return doublePrompt;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(askForRadius());
        System.out.println(circle.getRadius());


    }

}
