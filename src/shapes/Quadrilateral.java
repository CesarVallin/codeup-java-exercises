package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    /** Needed to create this class, since it implements Measurable */
    /** This is what this method looks like in Quadrilateral */
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public double getArea() {
        return (this.width * this.length);
    }
    /** Properties */
    protected double length;
    protected double width;

    /** Constructor */
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /** Getting length */
    public double getLength() {
        return this.length;
    }
    /** Getting width */
    public double getWidth() {
        return this.width;
    }
    /** *********************************************************************************************** */
    /** abstract method for setting length */
    /** Implemented in Square & rectangle */
    public abstract void setLength(double length);

    /** abstract method for setting width */
    public abstract void setWidth(double width);
}
