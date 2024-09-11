// Minimum among 3 numbers using Ternary operators

import java.util.Scanner;
public class Pgm19 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max = (a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println("The smallest among "+a+" and "+b+" and "+c+" is "+max);
    }
}