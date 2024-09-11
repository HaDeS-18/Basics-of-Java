// ArrayIndexOutOfBoundsException

import java.util.Scanner;

public class Pgm57 {
    public static void main(String args[])
    {
        String arr[]=new String[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 names");
        try
        {
            for(int i=0;i<4;i++)
            {
                arr[i]=sc.next();
            }
            System.out.println("Printing 5 names");
            for(int i=0;i<5;i++)
            {
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
            System.out.println("Exception caught while printing 5th name");
        }
        System.out.println("Rest of the code.......");
        sc.close();
    }
}