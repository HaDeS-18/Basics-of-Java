// Print the numbers form  1 to 100 which are divisible by 6 and not by 4.
public class Pgm10
{
    public static void main(String[] args) {
        int i = 1;
        while(i<=100)
        {
            if(i%6 ==0 && i%4 != 0)
                System.out.println(i);
            i++;
        }
    }
}