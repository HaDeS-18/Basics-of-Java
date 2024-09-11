// Demonstration of PrintStream

import java.io.PrintStream;

public class Pgm75 {
    public static void main(String[] args) {
        String data = "This is a text inside the file.";
        try
        {
            PrintStream output = new PrintStream("Sample_Output_File_for_Java.txt");
            output.print(data);
            output.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}