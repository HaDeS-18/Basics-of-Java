// Demonstration of BufferedOutputStream
import java.io.*;
public class Pgm72 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fout = new FileOutputStream("C:/Users/theaw/Documents/JavaProjects/src/Java_input.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to Java.";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");
    }
}
