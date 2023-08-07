package shapes;

public class Rectangle {

    // ---------------------------------------------------------------------------------------------------------
    // Instance properties
    protected double width;
    protected double length;
    // ---------------------------------------------------------------------------------------------------------
    // Constructor...
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    // ---------------------------------------------------------------------------------------------------------
    // Getters & Setters...
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
    public double getArea() {
        return this.length * this.width;
    }
}
