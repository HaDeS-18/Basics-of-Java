import java.util.Scanner;

public class Assessment4_Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        try
        {
            int result = a / (b-c);
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("divided by zero");
        }
        finally
        {
            System.out.println("inside finnaly");
            System.out.println(a/(b+c));
        }
        sc.close();
    }
}
