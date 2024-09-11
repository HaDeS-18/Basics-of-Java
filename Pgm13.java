// Palindrom or not

import java.util.Scanner;
public class Pgm13
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
        if(num == rev)
            System.out.println(num+" is a palindrome.");
        else
            System.out.println(num+" is not a plaindrome.");
        sc.close();
    }
}