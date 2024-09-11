import java.util.Scanner;

public class Assessment4_Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        a = sc.nextLine();
        b = null;
        try
        {
            int n = b.compareTo(a);
            System.out.println(n);
        }
        catch(NullPointerException e)
        {
            System.out.println("null value");
        }
        sc.close();
    }
}
