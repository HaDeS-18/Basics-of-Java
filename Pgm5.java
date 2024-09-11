// Find if the given age is eligible to vote.

import java.util.Scanner;
class Pgm5
{
    public static void main(String[] args) 
    {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<18)
            System.out.println("Not eligible");
        else
            System.out.println("Eligible");
        sc.close();
    }
}