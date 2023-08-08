package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    /** Needed to create this class, since it extends from quadrilateral*/
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super(length,width);
    }
}
