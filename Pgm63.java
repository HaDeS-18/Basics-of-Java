//Read the primitive data type using io package and display the same in the monitor.

import java.io.*;
public class Pgm63 {
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int num=Integer.parseInt(br.readLine());
        float num1=Float.parseFloat(br.readLine());// 6 to 7 decimals
        double num2=Double.parseDouble(br.readLine());//upto 15 decimals
        short num3=Short.parseShort(br.readLine());
        long num4=Long.parseLong(br.readLine());
        boolean bool=false;
        String str=br.readLine();
        char ch=br.readLine().charAt(0);
        System.out.println("    ");
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(ch);
        System.out.println(bool);
        System.out.println(str);
    }
}