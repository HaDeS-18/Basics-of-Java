/* 3. Write a java pgm to create class Shape with method calculateArea().
 *    Create subclasses Circle, Rectangle and Triangle. Override method in
 *    each subclass to return the shape's area. */

class Shape52
{
    public double calculateArea()
    {
        return 0;
    }
}
class Circle52 extends Shape52
{
    private double radius;
    public Circle52(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
}
class Rectangle52 extends Shape52
{
    private double width;
    private double height;
    Rectangle52(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea()
    {
        return width*height;
    }
}
class Triangle52 extends Shape52
{
    private double base, height;
    Triangle52(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea()
    {
        return 0.5*base*height;
    }
}
public class Pgm52 {
    public static void main(String[] args) {
        Circle52 c = new Circle52(4);
        Rectangle52 r = new Rectangle52(12, 34);
        Triangle52 t = new Triangle52(5, 9);
        System.out.println("Area of Circle: "+c.calculateArea());
        System.out.println("Area of Rectangle: "+r.calculateArea());
        System.out.println("Area of Triangle: "+t.calculateArea());
    }
}
