// Abstract Class and Abstract Method

abstract class Bike42
{
    abstract void run();
}

public class Pgm42 extends Bike42
{
    void run()
    {
        System.out.println("Running Safely.");
    }
    public static void main(String args[]) {
        Bike42 obj = new Pgm42();
        obj.run();
    }
}