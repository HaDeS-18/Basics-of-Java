// Demonstration of ArrayList

import java.util.*;

public class Pgm77 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");       // Adding object in ArrayList
        list.add("B");
        list.add("C");
        list.add("AB");
        Iterator<String> itr = list.iterator();    // Traversing through Iterator
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
