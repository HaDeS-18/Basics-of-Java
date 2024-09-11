// Demonstration of final class

/*final*/ class myFinalClass
{
    void myFinalMethod()
    {
        System.out.println("Final class object is created and method used.");
    }
}

class Pgm39 extends myFinalClass
{
    public static void main(String args[])
    {
        Pgm39 fc = new Pgm39();
        fc.myFinalMethod();
    }
}
