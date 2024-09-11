// Multiplication of two 3x3 matrices

import java.util.Scanner;

public class Pgm28 {
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
                c[i][j] = 0;
                for(int k=0; k<3; k++)
                {
                    c[i][j] += a[i][k]*b[k][j];
                }
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
