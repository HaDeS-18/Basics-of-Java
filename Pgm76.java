// Demonstration of Appending content to a file

import java.io.FileWriter;
import java.io.IOException;

public class Pgm76 {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("Sample_Output_File_for_Java.txt", true);
        fw.write(" Appending content");
        fw.close();
    }
}
