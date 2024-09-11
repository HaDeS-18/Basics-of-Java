/* Write a Java program to create a class called Rectangle with width and height attributes. 
Calculate the Area and Perimeter of the rectangle. */

class Rectangle
{
    float length, breadth;
    Rectangle(float l, float b)
    {
        this.length = l;
        this.breadth = b;
    }
    float Area()
    {
        return(length*breadth);
    }
    float Perimeter()
    {
        return((length+breadth)/2);
    }
}

public class Pgm34 {
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle(7,10);
        float a1 = r1.Area();
        float p1 = r1.Perimeter();
        System.out.print("Area is "+a1+" and Perimeter is "+p1);
    }
}
