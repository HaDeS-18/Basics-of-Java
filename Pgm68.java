/* With input as a either one or more3 than one files, count the number of 
 * lines in each file and display it with the file name. */

import java.io.File;
import java.util.Scanner;
public class Pgm68 {
    public static void main(String[] args) {
        if(args.length == 0)
        {
            System.out.println("Usage: java Pgm68 <file-names>");
            return;
        }
        for(int i=0; i<args.length;i++)
        {
            System.out.print(args[i]+": ");
            countLines(args[i]);
        }
    }
    static void countLines(String fileName)
    {
        int count = 0;
        try{
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                sc.nextLine();
                count++;
            }
            System.out.println("Total number of Lines: "+count);
            sc.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
