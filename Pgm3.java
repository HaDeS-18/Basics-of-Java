// Using java.io.*
import java.io.*;
class Pgm35
{
    public static void main(String args[])
    {
        try
        {
            int a;
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            a = Integer.parseInt(str);
            System.out.println("a value is "+a);
        }
        catch(Exception e)
        {       }
    }
}