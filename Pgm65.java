// Demonstration of FileReader

import java.io.*;

public class Pgm65 {
    public static void main(String args[])throws IOException
    {
        int i;
        FileReader fr =new FileReader("C:/Users/theaw/Documents/JavaProjects/src/Sample_File_for_Java.txt");
        while((i=fr.read())!=-1)
        {
            System.out.print((char)i);
        }
        System.out.println("");
        fr.close();
    }

}
