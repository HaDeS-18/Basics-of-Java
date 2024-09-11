// Demonstration of FileInputStream

import java.io.*;

public class Pgm64 {
    public static void main(String args[])throws IOException
    {
        int ch;
        FileInputStream fin = new FileInputStream("C:/Users/theaw/Documents/JavaProjects/src/Sample_File_for_Java.txt");
        while((ch=fin.read())!=-1)
            System.out.print((char)ch);
        System.out.println("");
        fin.close();
    }

}
