// Demonstration of DataOutputStream

import java.io.*;

public class Pgm70 {
    public static void main(String[] args)throws IOException {
        FileOutputStream file = new FileOutputStream("C:/Users/theaw/Documents/JavaProjects/src/Java_input.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Success");
    }
}
