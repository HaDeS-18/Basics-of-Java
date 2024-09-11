// Make a base class Animal with method Sound() and inherited class Cat with method Sound1().

class Animal47
{
    void Sound()
    {
        System.out.println("This is an animal.");
    }
}
class Cat47 extends Animal47
{
    //void Sound1()
    void Sound()
    {
        System.out.println("This is a cat.");
    }
}
public class Pgm47 {
    public static void main(String[] args) {
        Cat47 c = new Cat47();
        c.Sound();
        //c.Sound1();
    }
}
