// Biggest among 10 numbers
import java.util.Scanner;

public class Pgm23 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i;
        System.out.println("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        int max=a[0];
        for(i=1;i<10;i++)
        {
            if(a[i]>max)
                max = a[i];
        }
        System.out.println("Biggest among given numbers is "+max+".");
        sc.close();
    }
}
