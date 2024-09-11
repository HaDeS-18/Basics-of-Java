// Read and display a 3x3 matrix
import java.util.Scanner;
public class Pgm26 {
    public static void main(String[] args) {
        int a[][] = new int[3][3], i, j;
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
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
