package shapes;


public class Circle {

    // In contrast to `instance fields` are `static fields`, those that belong to a class as a whole. Static fields are accessible through the class itself. In other words, they are accessible without creating an instance of the class.

    // Static properties...
    final public static double PI = Math.PI;
    protected static int circlesCreated = 0;
    // static method to check amount of `circlesCreated` at any given point.
    protected static int getCirclesCreated() {
        return circlesCreated;
    }

    // ---------------------------------------------------------------------------------------------------------
    // Instance properties (fields)...
    private double radius;
    // ---------------------------------------------------------------------------------------------------------
    // Creating instances of the Circle class
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
    // Instance / Object methods...
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
