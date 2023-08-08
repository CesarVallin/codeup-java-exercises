package shapes;

public class Square extends Quadrilateral implements Measurable {
    /** Needed to create this class, since it implements Measurable */
    /** This is what this method looks like in Quadrilateral */

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public double getArea() {
        return (this.width * this.length);
    }


    /** Constructor */
    protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }
}
