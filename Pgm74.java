// Demonstration of DeSerialisation

import java.io.*;
public class Pgm74 implements Serializable{
    public static void main(String[] args) {
        Pgm73 s = new Pgm73();
        try{
            FileInputStream in = new FileInputStream("Sample_Output_File_for_Java.txt");
            ObjectInputStream in1 = new ObjectInputStream(in);
            s = (Pgm73)in1.readObject();
            in.close();
            in1.close();
            System.out.println("deserialised");
            System.out.println(s.name);
            System.out.println(s.address);
            System.out.println(s.id);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e1)
        {
            System.out.println("not found");
            return;
        }
    }
}
