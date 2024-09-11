/*Multiply 2 integers by getting two inputs by using io objects,
* whenever we are using buffered reader we need to throw exception or we need to write the try and catch exception.*/

import java.io.*;

public class Pgm62 {
    public static void main(String args[])throws IOException
    {
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter two numbers");
            int num1=Integer.parseInt(br.readLine());
            int num2=Integer.parseInt(br.readLine());
            System.out.println("Result = "+num1*num2);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
