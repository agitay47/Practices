package Inheritance.Practice5;
/* 2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
             give the instance variables that are needed to calculate the Area, perimeter, of those shapes*/

public class Circle  extends Shape{
    private double radius;
    public static double pi;
    static {
        pi = 3.14;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void calculateAreaOfCircle() {
        area = pi * radius * radius;
        System.out.println("Area of circle: " + area);
    }
    public void calculatePerimeterOfCircle() {
        perimeter = 2 *( pi * radius );
        System.out.println("Perimeter of circle: " + perimeter);
    }


}
