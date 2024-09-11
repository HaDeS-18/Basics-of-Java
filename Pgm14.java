// Check if number is prime or not

import java.util.Scanner;
public class Pgm14
{
    public static void main(String[] args) {
        int num, count=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i=2; i<=num/2; i++)
        {
            if(num%i == 0)
                count++;
        }
        if(count!=0)
            System.out.println(num+" is not a prime number.");
        else
            System.out.println(num+" is a prime number.");
        sc.close();
    }
}