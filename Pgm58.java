// NullPointerException

public class Pgm58 {
    public static void main(String args[])
    {
        String ptr=null;
        try
        {
            if(ptr.equals("scope"))
                System.out.println("Equals");
            else
                System.out.println("Not Equal");
        }catch(NullPointerException e)
        {
            e.printStackTrace();
            System.out.println("Exception caught");
        }
        finally
        {
            System.out.println("success");
        }
    }

}
