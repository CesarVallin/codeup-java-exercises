package pearsonsInheritance;

public class CircleGO extends GeometricObject{

    private double radius;

    /**
     * Construct a geometric object with the specified color and filled value
     *
     * @param color
     * @param filled
     */
    public CircleGO(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return this.radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return (this.radius * this.radius) * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * this.radius;
    }
    /** Return perimeter */
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    /** Print the circle infor */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + this.radius);
    }


}
