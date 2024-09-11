// ArithmeticException. Print division of two number if numerator is not less than zero.

public class Pgm60 {
    public int Division(int a,int b)throws ArithmeticException
    {
        if(a<0)
        {
            throw new ArithmeticException("The number is negative");
        }
        int div=a/b;
        return div;
    }
    public static void main(String args[])
    {
        Pgm60 obj1=new Pgm60();
        try{
            obj1.Division(10, 0);
        }catch(ArithmeticException e2)
        {
            e2.printStackTrace();
        }
        System.out.println("Rest of the code......");
    }

}
