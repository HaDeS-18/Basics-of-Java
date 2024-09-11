// Find Factorial of a given number

import java.util.Scanner;
public class Pgm15
{
    public static void main(String[] args) {
        int num, i;
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println("The factorial of "+num+" is "+fact);
        sc.close();
    }
}