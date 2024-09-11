// Sort n numbers in descending order

import java.util.Scanner;
public class Pgm25 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n], k=0, i,  j;
        while(k<n)
        {
            a[k] = sc.nextInt();
            k++;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
