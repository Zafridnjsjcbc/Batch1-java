//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class ShapeTest {
    public static void main(String[] args) {


        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(6.0,"Circle");
        shapes[1] = new Rectangle(5.0,7.0,"Rectangle");
        shapes[2] = new Triangle(5.0,6.0,7.0,"Triangle");

        for (Shape shape : shapes) {
            System.out.println(shape.shapeName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());

        }
    }
}
abstract class Shape
{
    abstract double calculateArea();
    abstract double calculatePerimeter();
    abstract String shapeName();

}
class Circle extends Shape
{
    private double radius;
    private String name1;
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }


    public Circle (double radius,String name1) {
        this.radius = radius;
        this.name1 = name1;

    }
    String shapeName(){
        return name1;
    }
    double calculateArea()
    {
       return Math.PI*radius*radius;
    }
    double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
class Rectangle extends Shape
{
  private double length;
  private double width;
  private String name2;

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public Rectangle (double length, double width,String name2) {
        this.length = length;
        this.width = width;
        this.name2 = name2;
    }
    String shapeName(){
        return name2;
    }
  double calculateArea ()
  {
      return length*width;

  }
  double calculatePerimeter()
  {
      return 2*(length+width);
  }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



}
class Triangle extends Shape
{
   private double side1;
    private double side2;
    private double side3;

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    private String name3;
    public Triangle(double side1, double side2, double side3,String name3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.name3 = name3;
    }
    String shapeName(){
        return name3;
    }
    double calculateArea()
    {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }
    double calculatePerimeter()
    {
        return side1 + side2 + side3;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

}