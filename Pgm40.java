// Final Method

class Honda
{
    public /*final*/ void myFun1()
    {
        System.out.println("Function executed in Honda");
    }
}

class Bike extends Honda
{
    public void myFun1()
    {
        System.out.println("Function executed in Bike");
    }
}

public class Pgm40
{
    public static void main(String args[])
    {
        Bike obj = new Bike();
        obj.myFun1();
    }
}