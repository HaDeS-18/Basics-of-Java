// 1. Hierarchial Inheritance using class Animal, Tiger and Dog

class Animal50
{
    void sound()
    {
        System.out.println("Animal Sound");
    }
}
class Tiger50 extends Animal50
{
    void sound()
    {
        System.out.println("Tiger Sound");
    }
}
class Dog50 extends Animal50
{
    void sound()
    {
        System.out.println("Dog Sound");
    }
}

public class Pgm50 {
    public static void main(String[] args) {
        Animal50 obj1 = new Animal50();
        Tiger50 obj2 = new Tiger50();
        Dog50 obj3 = new Dog50();
        obj1.sound();
        obj2.sound();
        obj3.sound();
    }
}
