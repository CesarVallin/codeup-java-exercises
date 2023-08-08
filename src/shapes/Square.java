package shapes;

public class Square extends Rectangle {

    private double side;

    public Square(double side) {
        super(side, side); // extends from the super class
        this.side = side;
    }
    // ---------------------------------------------------------------------------------------------------------
    // Getters and Setters ... override.
    public double getPerimeter() {
        return 4 * side;
    }
    public double getArea() {
        return side * side;
    }

}
