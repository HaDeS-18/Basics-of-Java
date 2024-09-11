// Demonstration of Object-Oriented Programming

class Student 
{
    String name;
    int age, regno;
    Student(String name, int age, int regno)
    {
        this.name = name;
        this.age = age;
        this.regno = regno;
    }
    float Percentage(int m1, int m2)
    {
        return((m1+m2)/2);
    }
}
public class Pgm32
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Pratik",18,129);
        Student s2 = new Student("Harsh",19,78);
        System.out.print(s1.name+"\t"+s1.age+"\t"+s1.regno);
        float avg1 = s1.Percentage(100, 98);
        System.out.println("\t"+avg1);
        System.out.print(s2.name+"\t"+s2.age+"\t"+s2.regno);
        float avg2 = s2.Percentage(70, 68);
        System.out.print("\t"+avg2);
    }
}