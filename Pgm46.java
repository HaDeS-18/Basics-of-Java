// Demonstration of single inheritance

class A46
{
    int a,b;
    void display()
    {
        System.out.println("Inside Class A, a = "+a+" and b = "+b);
    }
}
class B46 extends A46
{
    int c;
    void display1()
    {
        System.out.println("Inside Class B, c = "+c);
    }
}
public class Pgm46 {
    public static void main(String[] args) {
        B46 obj = new B46();
        obj.a = 10;
        obj.b = 20;
        obj.c = 30;
        obj.display();
        obj.display1();
    }
}