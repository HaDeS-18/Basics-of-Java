// Print Fibonacci Series

import java.util.Scanner;
public class Pgm17 {
    public static void main(String[] args) {
        int num, i, a=0, b=1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num<2)
        {
            System.out.println("Error");
            num = sc.nextInt();
        }
        System.out.println(0);
        for(i=0; i<num-1; i++)
        {
            System.out.println(b);
            b = b+a;
            a = b-a;
        }
    }
}
