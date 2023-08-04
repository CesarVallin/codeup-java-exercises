package pearsonCircles;

/**
 * Define the circle class with two constructors.. *****************************
 */
public class Circle {
    // -----------------------------------------------------------------------------------------------
     /** class Circle data field */
     /*
     This is a member variable, which means that any object we create has a copy of this variable, which means we can create as many objects as we like and they can each have their own radius
      */
    private double radius;
    // -----------------------------------------------------------------------------------------------
    /*
    Think about how the Circle class is going to be used...
    Let's create a couple of constructors so that people using our software can create a circle.
    so `public`.
     */
    // --------------------------------------------
    /** Construct a circle with radius 1 */
    /** non-arg constructor ***************************** ******************************/
    public Circle() {
        radius = 1;
    }

    /** Constructor a circle with a specified radius */
    /** Second constructor ***************************** ******************************/
    public Circle(double newRadius) {
        this.radius = newRadius;
        // The `this` keyword basically refers to the particular object that we're operating on now.
    }
    // --------------------------------------------
    /** getArea */
    public double getArea() {
        return radius * radius * Math.PI;
    }
    /** getPerimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    /** setRadius */
    // Think of it as update the radius of our circle
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }


}
