// Demonstration of Vector

import java.util.Iterator;
import java.util.Vector;

public class Pgm79 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("AZ");
        v.add("AM");
        v.add("AS");
        v.add("GPS");
        Iterator<String> itr = v.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
