package pearsonsInheritance;

/** Keyword extends `extends` superclass data fields */
public class RectangleGO extends GeometricObject {

    private double width;
    private double height;

    /**
     * Construct a geometric object with the specified color and filled value
     *
     * @param color
     * @param filled
     */
    public RectangleGO(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    /** Return width */
    public double getWidth() {
        return this.width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return this.height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Return area */
    public double getArea() {
        return this.height * this.width;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

}
