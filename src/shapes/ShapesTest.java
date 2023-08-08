package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        /** Remember, the name of your class gives access to certain methods*/
        Quadrilateral myShape;

        myShape = new Rectangle(3, 5);
        System.out.println("The perimeter of myShape is: " + myShape.getPerimeter());
        System.out.println("The area of myShape is: " + myShape.getArea());

        /** On top, try declaring the variable Measurable instead of Quadrilateral, you should expect errors below */
        double length = myShape.getLength();
        System.out.println(length); //
    }
}
