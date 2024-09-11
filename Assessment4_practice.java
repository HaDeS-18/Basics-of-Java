import java.util.Scanner;

class Check
{
    void check(int n) throws IllegalArgumentException
    {
            if(n%2!=0)
                throw new IllegalArgumentException();
            else
                System.out.println(n*n);
    }
}
public class Assessment4_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        Check c = new Check();
        try
        {
            c.check(num);
        }
        catch(IllegalArgumentException i)
        {
            System.out.println("error in argument");
        }
        sc.close();
    }
}
