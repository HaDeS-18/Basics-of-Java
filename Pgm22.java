// Read 5 subject marks and calculate total and average. If avg >=50, then pass.
import java.util.Scanner;
public class Pgm22 {
    public static void main(String[] args) {
        int marks[] = new int[5], total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects: ");
        for(int i=0; i<5; i++)
        {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double average = total / 5;
        if(average>=50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        sc.close();
    }
}
