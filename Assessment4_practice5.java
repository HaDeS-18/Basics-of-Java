import java.io.*;

public class Assessment4_practice5
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str1 = br.readLine();
            String str2 = br.readLine();
            int a = Integer.parseInt(str1);
            int b = Integer.parseInt(str2);
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero");
        }
        finally
        {
            System.out.println("inside finally");
        }
    }
}
