// Reverse the string
import java.util.Scanner;
public class Pgm30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        char arr[] = s.toCharArray();
        for(char c:arr)
        {
            count++;
        }
        System.out.print("Reverse: ");
        for(int i=count-1; i>=0; i--)
        {
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
