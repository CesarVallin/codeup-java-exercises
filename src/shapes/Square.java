package shapes;

public class Square extends Quadrilateral implements Measurable {


    /** Constructor */
    protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
