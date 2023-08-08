package pearsonsInheritance;

public class TestCircleGORectangleGO {

    public static void circleInfoPrompt(CircleGO varName) {
        System.out.println("A circle " + varName.toStringG()); // from superClass
        System.out.println("The color is: " + varName.getColor()); // from superClass
        System.out.println("The radius is: " + varName.getRadius()); // subClass method
        System.out.println("the area is: " + varName.getArea()); // subClass method
        System.out.println("The diameter is: " + varName.getDiameter()); // subClass method
    }

    public static void main(String[] args) {
        CircleGO circle1 = new CircleGO("green", true, 3.45);
        circleInfoPrompt(circle1);
    }
}
