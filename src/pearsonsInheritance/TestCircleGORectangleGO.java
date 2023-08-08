package pearsonsInheritance;

public class TestCircleGORectangleGO {
    public static void main(String[] args) {
        CircleGO circle1 = new CircleGO("green", true, 3.45);
        System.out.println("A circle " + circle1.toStringG()); // from superClass
        System.out.println("The color is: " + circle1.getColor()); // from superClass
        System.out.println("The radius is: " + circle1.getRadius()); // subClass method
        System.out.println("the area is: " + circle1.getArea()); // subClass method
        System.out.println("The diameter is: " + circle1.getDiameter()); // subClass method
    }
}
