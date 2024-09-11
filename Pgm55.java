// Demonstration of Exception
import java.util.Scanner;
public class Pgm55 {
    public static void main(String[] args) {
        int a,b,result;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        result = a/b;
        System.out.println("Result: "+result);
        System.out.println("Rest of the code.....");
        sc.close();
    }
}
