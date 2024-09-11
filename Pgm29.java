// Count number of characters in a string
import java.util.Scanner;
public class Pgm29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        char arr[] = s.toCharArray();
        for(char c:arr)
        {
            count++;
        }
        System.out.println("The length of the string is "+count+".");
        sc.close();
    }
}