/* 2. Write a java pgm to create class Vehicle with method speedUp(). Create two subclasses
 *    Car and Bicycle. Override speedUp() in each subclass to increase the speed differently.*/

class Vehicle51
{
    private int speed;
    public void speedUp()
    {
        speed += 10;
    }
    public int getSpeed()
    {
        return speed;
    }
}
class Car51 extends Vehicle51
{
    @Override
    public void speedUp()
    {
        super.speedUp();
        System.out.println("\nCar speed increased by 22 units");
    }
}
class Motorcycle51 extends Vehicle51
{
    @Override
    public void speedUp()
    {
        super.speedUp();
        System.out.println("Motorcycle speed increased by 12 units");
    }
}
public class Pgm51 {
    public static void main(String[] args) {
        Car51 car = new Car51();
        Motorcycle51 motorcycle = new Motorcycle51();
        System.out.println("Car initial speed: "+car.getSpeed());
        System.out.println("Motorcycle initial speed: "+motorcycle.getSpeed());
        car.speedUp();
        motorcycle.speedUp();
        System.out.println("Car after speeding up: "+car.getSpeed());
        System.out.println("Motorcycle after speeding up: "+motorcycle.getSpeed());
    }
}
