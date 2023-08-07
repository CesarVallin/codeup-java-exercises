package shapes;


public class Circle {

    // Static section...
    // In contrast to `instance fields` are `static fields`, those that belong to a class as a whole. Static fields are accessible through the class itself. In other words, they are accessible without creating an instance of the class.
    // ---------------------------------------------------------------------------------------------------------
    // Static properties...
    final public static double PI = Math.PI;
    protected static int circlesCreated = 0;
    // static field to build `circleIdentifier`...
    protected static int circleId = 1;
    // static field to build `circleIdentifier`...
    protected static String circleName = "circle";


    // Static methods...
    // static method to check amount of `circlesCreated` at any given point...
    public static int getCirclesCreated() {
        return circlesCreated;
    }
    // static method to get incremented circleId...
    public static int getCircleId() {
        return circleId;
    }
    // static method to get circleName
    public static String getCircleName() {
        return circleName;
    }
    // static method to provide a different instance identifier to each circle...
    public static String circleIdentifier(String circleName, int circleId) {
        return circleName + circleId;
    }



    // Instance section...
    // ---------------------------------------------------------------------------------------------------------
    // Instance properties (fields)...
    private double radius;
    // ---------------------------------------------------------------------------------------------------------
    // Creating instances of the Circle class
    // Constructors...
    // non-arg constructor --- --- ---
    public Circle() {
        radius = 1;
    }
    // arg constructor --- --- ---
    public Circle(double newRadius) {
        this.radius = newRadius;
        circlesCreated++;
        circleId++;
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
