// Multiplication Table

import java.util.Scanner;
class Pgm16
{
    public static void main(String[] args) {
        int num, i;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(i=0; i<=10; i++)
        {
            System.out.println(num+" x "+i+" = "+num*i);
        }
        sc.close();
    }
}