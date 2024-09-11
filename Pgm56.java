// Exception Handling

import java.util.Scanner;

public class Pgm56 {
    public static void main(String[] args) 
    {
        int a,b,result;
        Scanner sc = new Scanner(System.in);
        try
        {
            a = sc.nextInt();
            b = sc.nextInt();
            result = a/b;
            System.out.println("Result: "+result);
        }
        catch(Exception e)
        {
            System.out.println("Exception Caught");
            e.printStackTrace();
        }
        System.out.println("Rest of the Code");
        sc.close();
    }
}
