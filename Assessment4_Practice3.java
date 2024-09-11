import java.util.Scanner;


public class Assessment4_Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,result;
        try
        {
            a = sc.nextInt();
            b = sc.nextInt();
            result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divided by zero");
        }
        catch(Exception e)
        {
            System.out.println("Int needed");
        }
        sc.close();
    }
}
