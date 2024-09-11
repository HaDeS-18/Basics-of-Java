// Find if a number is positive or negative or zero
import java.util.Scanner;
class Pgm6
{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<0)
            System.out.print("Negative");
        else if(a==0)
            System.out.print("Zero");
        else
            System.out.print("Negative");
        sc.close();
    }
}