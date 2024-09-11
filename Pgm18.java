// Find max among 2 numbers using Ternary Operators.

import java.util.Scanner;
public class Pgm18 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int max = a>b?a:b;
        System.out.println("The biggest among "+a+" and "+b+" is "+max);
    }
}
