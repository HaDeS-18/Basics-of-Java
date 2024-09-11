// Using java.util
import java.util.Scanner;
class Pgm4
{
    public static void main(String args[])
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a*b;
        System.out.print(c);
        sc.close();
    }
}