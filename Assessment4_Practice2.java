import java.util.Scanner;

class MyException extends Exception
{
    MyException(String s)
    {
        System.out.println(s);
    }
}
class Mark
{
    void marks(int n) throws MyException
    {
        if(n<0)
            throw new MyException("Mark is negative");
        else
            throw new MyException("Mark is positive");
    }
}
public class Assessment4_Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Mark m = new Mark();
        try
        {
            m.marks(n);
        }
        catch(MyException e)
        {
            
        }
        sc.close();
    }
}
