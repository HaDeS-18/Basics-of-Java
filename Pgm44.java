// Demonstration of Static keyword

public class Pgm44
{
    static int x = 10;
    static int y;

    public static class Demo
    {
        static int z = 100;
    }
    static
    {
        System.out.println("Static block initialised.");
        y = x+4;
    }
    public static void main(String[] args) {
        System.out.println("Value of x : "+x);
        System.out.println("Value of y : "+y);
        System.out.println("Value of z : "+ Demo.z);
    }
}