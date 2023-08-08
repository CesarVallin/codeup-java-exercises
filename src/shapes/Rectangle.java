package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    /** Needed to create this class, since it extends from quadrilateral*/
    /** Abstract Quadrilateral class is making sure that you include your abstract methods!!!*/
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

    public Rectangle(double length, double width) {
        super(length,width);
    }
}
