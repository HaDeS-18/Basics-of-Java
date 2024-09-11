/* Write a java program to create an abstract class Animal with an an abstract method
 * called sound(). Create subclasses Lion and Tiger that extend the Animal class and
 * implement the sound() method to make a specific sound for each animal. */

 abstract class Animal
 {
    abstract void sound();
 }
 class Lion extends Animal
 {
    void sound()
    {
        System.out.println("Roarrrrrr !!!!");
    }
 }
 class Tiger extends Animal
 {
    void sound()
    {
        System.out.println("Meowwwwww !!!!!");
    }
 }
public class Pgm43 {
    public static void main(String[] args) {
        Animal l = new Lion();
        Animal t = new Tiger();
        l.sound();
        t.sound();
    }
}