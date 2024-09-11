// Read 5 numbers and print only even numbers.
import java.util.Scanner;
public class Pgm20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int i;
        System.out.println("Enter 5 numbers: ");
        for(i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(a[i]%2 == 0)
                System.out.println(a[i]);
        }
        sc.close();
    }
}
