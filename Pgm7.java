// Find if given char is alphabet or not

import java.util.Scanner;
public class Pgm7
{
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if(ch>=65 && ch<=90)
            System.out.println("Yes");
        else if(ch>=97 && ch<=122)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}