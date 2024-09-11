// Demonstration of user-defined package
import Alphabet.*;

public class Pgm53 {
    public static void main(String[] args) {
        Vowels v = new Vowels();
        v.displayVowels();
        Consonants c = new Consonants();
        c.displayConsonants();
    }
}
