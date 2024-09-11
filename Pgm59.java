// ArithmeticException. Print square of number if it is not less than 1.

public class Pgm59 {
    public void CheckNum(int num)
    {
        if(num<1)
            throw new ArithmeticException("Number is Negative");
        else
            System.out.println(num*num);
    }
    public static void main(String args[])
    {
        Pgm59 obj=new Pgm59();
        try{
            obj.CheckNum(-1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Rest of the code....");
    }

}
