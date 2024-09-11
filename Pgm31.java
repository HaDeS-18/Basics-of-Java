// Count number of uppercase, lowercase
import java.util.Scanner;
public class Pgm31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int upr=0,lwr=0,dig=0,sym=0;
        char arr[] = s.toCharArray();
        for(int i=0; i<s.length();i++)
        {
            if(arr[i]>=48 && arr[i]<=57)
                dig++;
            else if(arr[i]>=65 && arr[i]<=90)
                upr++;
            else if(arr[i]>=97 && arr[i]<=122)
                lwr++;
            else
                sym++;
        }
        System.out.println("Uppercase: "+upr+"\tLowercase: "+lwr+"\nDigits: "+dig+"\tSymbols: "+sym);
        sc.close();
    }
}
