// Perform Subtraction of two matrices
import java.util.Scanner;
public class Pgm27 {
    public static void main(String[] args) {
        int a[][] = new int[3][3],b[][] = new int[3][3],c[][] = new int[3][3], i, j;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
