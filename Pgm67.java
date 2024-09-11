/* Yeswant wants to submit a short story for a competition but his document
 * should meet the word count provided. Help him to find number of characters
 * and number of lines and number of words in the document. */

import java.io.*;
public class Pgm67 {
    public static void main(String[] args)throws IOException {
        long nl=0,nw=0,nc=0;
        String line;
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/theaw/Documents/JavaProjects/src/Sample_File_for_Java.txt"));
        while((line=br.readLine())!=null)
        {
            nl++;
            nc = nc + line.length();
            int i=0;
            boolean pspace = true;
            while(i<line.length())
            {
                char c = line.charAt(i++);
                boolean cspace = Character.isWhitespace(c);
                if(pspace && !cspace)
                    nw++;
                pspace = cspace;
            }
        }
        System.out.println("Number of Characters : "+nc);
        System.out.println("Number of Words : "+nw);
        System.out.println("Number of Lines : "+nl);
        br.close();
    }
}