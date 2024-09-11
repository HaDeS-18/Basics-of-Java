// Display Employee details

import java.util.Scanner;
class Employee
{
    String name;
    int id, salary;
    Employee(String name, int id, int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    float Bonus()
    {
        return(salary*15/100);
    }
}

public class Pgm33 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        Employee e1 = new Employee(n1,n2,n3);
        String n4 = sc.next();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();
        Employee e2 = new Employee(n4,n5,n6);
        float b1 = e1.Bonus();
        float b2 = e2.Bonus();
        System.out.println(e1.name+"\t"+e1.id+"\t"+e1.salary+"\t"+b1);
        System.out.println(e2.name+"\t"+e2.id+"\t"+e2.salary+"\t"+b2);
        sc.close();
    }
}
