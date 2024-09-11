// User-Defined Exception

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MyException extends Exception 
{
    public MyException(String str)
    {
        System.out.println(str);
    }
}
public class Pgm61 {
    public static void main(String args[])throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Mark ::");
        try{
            int mark = Integer.parseInt(br.readLine());
            if(mark<0)
                throw new MyException("Mark is Negative");
            else
                throw new MyException("Mark is positive");
        }catch (MyException m)
        {                    }
    }

}
