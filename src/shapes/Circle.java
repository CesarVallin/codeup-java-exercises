package shapes;

import util.Input;

public class Circle {

    // In contrast to `instance fields` are `static fields`, those that belong to a class as a whole. Static fields are accessible through the class itself. In other words, they are accessible without creating an instance of the class.
    final public static double PI = Math.PI;

    // ---------------------------------------------------------------------------------------------------------
    // Instance properties (fields)...
    private double radius;
    // Static properties...
    protected static int circlesCreated = 0;
    // ---------------------------------------------------------------------------------------------------------
    // Constructors...
    // non-arg constructor
    public Circle() {
        radius = 1;
    }
    // arg constructor
    public Circle(double newRadius) {
        this.radius = newRadius;
        circlesCreated++;
    }
    // ---------------------------------------------------------------------------------------------------------
    // Getters & Setters
    public double getArea() {
        return PI * (this.radius * this.radius);
    }
    public double getCircumference() {
        return 2 * PI * this.radius;
    }
    public double getRadius(){
        return this.radius;
    }
    // ---------------------------------------------------------------------------------------------------------



}
