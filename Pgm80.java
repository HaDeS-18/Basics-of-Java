// Demonstration of Stack

import java.util.Iterator;
import java.util.Stack;

public class Pgm80 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("AZ");
        stack.push("AM");
        stack.push("AS");
        stack.push("GPS");
        Iterator<String> itr = stack.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
