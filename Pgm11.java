// Find the sum of digits of a number

import java.util.Scanner;
public class Pgm11
{
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num>0)
        {
            sum += num%10;
            num = num/10;
        }
        System.out.println("The sum is "+sum);
        sc.close();
    }
}