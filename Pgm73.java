// Demonstration of Serialisation

import java.io.*;
public class Pgm73 implements Serializable {
    public String name;
    public String address;
    public int id;
    public static void main(String[] args) {
        Pgm73 s = new Pgm73();
        s.name = "dargar";
        s.address = "mumbai";
        s.id = 1;
        try{
            FileOutputStream out = new FileOutputStream("Sample_Output_File_for_Java.txt");
            ObjectOutputStream out1 = new ObjectOutputStream(out);
            out1.writeObject(s);
            out.close();
            out1.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}