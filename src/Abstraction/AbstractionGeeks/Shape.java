package Abstraction.AbstractionGeeks;

abstract class Shape {
    String color;

    // these are abstract methods
    abstract double area(); //no body
    public abstract String toString(); //no body

    // abstract class can have constructor
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() {
        return color;
    }
}
class Circle extends Shape
{
    double radius; //new variable

    public Circle(String color,double radius) { //constructor

        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }//implementation added

    @Override
    public String toString() {//implementation added
        return "Circle color is " + super.color +
                "and area is : " + area();
    }

}
class Rectangle extends Shape{

    double length; //new variable
    double width; //new variable

    public Rectangle(String color,double length,double width) { //constructor
        // calling Shape constructor
        super(color); //Shape constructor called
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }//new implementation added

    @Override
    public String toString() {//new implementation added
        return "Rectangle color is " + super.color +
                "and area is : " + area();
    }

}

