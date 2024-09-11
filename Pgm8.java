// Find if given char is vowel or not

import java.util.Scanner;

public class Pgm8
{
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
            default:
                System.out.println("not a vowel");
        }
        sc.close();

    }
}