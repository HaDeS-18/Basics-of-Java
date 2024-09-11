// Reverse a given number

import java.util.Scanner;
public class Pgm12
{
    public static void main(String[] args) {
        int num, n ,rev=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        n = num;
        while(n>0)
        {
            rev = rev*10 + (n%10);
            n = n/10;
        }
        System.out.println("The reverse of "+num+" is "+rev);
        sc.close();
    }
}