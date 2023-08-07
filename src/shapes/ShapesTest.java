package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("The perimeter of box1 is " + box1.getPerimeter() + " and area is " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println("The perimeter of box2 is " + box2.getPerimeter() + " and area is " + box2.getArea());
    }
}
