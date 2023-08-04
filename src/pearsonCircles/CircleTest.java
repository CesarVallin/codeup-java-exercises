package pearsonCircles;

public class CircleTest {

    public static void main(String[] args) {
        /** Create a circle with radius 1, then two more with a specified radius */
        Circle c1 = new Circle();
        Circle c2 = new Circle(25);
        Circle c3 = new Circle(125);
        /** So now we have three objects, that all represent circles, that were all defined using the Circle.java Class, which describes the kinds of things that a circle aught to be able to do, and now we actually created objects, that are circles, and each one has their own radius */

        System.out.println("Circle 1 area: " + c1.getArea());
        System.out.println("Circle 2 area: " + c2.getArea());
        /** Each copy of our circle, in other words each object, has its own copy of radius, which is exactly what we want, there's no point in having multiple circle objects, and we can only define one radius, that's not useful*/
        System.out.println("Circle 3 perimeter: " + c3.getPerimeter());

        /** Modify circle radius */
        c2.setRadius(100);
        System.out.println("Circle's 2 area is now: " + c2.getArea());
    }
}
