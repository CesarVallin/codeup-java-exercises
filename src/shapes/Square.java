package shapes;

public class Square extends Quadrilateral {


    /** Constructor */
    protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}
