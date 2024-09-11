// Demonstration of multilevel inheritance

class Electronics
{
    Electronics()
    {
        System.out.println("Class Electronics");
    }
    void P1()
    {
        System.out.println("Device Type : Electronics");
    }
}
class Grinder extends Electronics
{
    Grinder()
    {
        System.out.println("Class Grinder");
    }
    void P2()
    {
        System.out.println("Category : Grinder");
    }
}
class WetGrinder extends Grinder
{
    WetGrinder()
    {
        System.out.println("Class WetGrinder");
    }
    void P3()
    {
        System.out.println("Grinding Technology : WetGrinder");
    }
}
public class Pgm48 {
    public static void main(String[] args) {
        WetGrinder wg = new WetGrinder();
        wg.P1();
        wg.P2();
        wg.P3();
    }
}
