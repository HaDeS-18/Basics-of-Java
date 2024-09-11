// Demonstration of FileWriter

import java.io.*;

public class Pgm66 {
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String Content=br.readLine();
        try
        {
            FileWriter fw=new FileWriter("C:/Users/theaw/Documents/JavaProjects/src/Sample_File_for_Java.txt");
            fw.write(Content);
            fw.close();
        }catch(Exception e)
        {                 }
    }
}
