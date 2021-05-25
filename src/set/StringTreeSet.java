package set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
    public static void main(String[] args) {
        // TreeSet orders strings in alphabetical order
        Set<String> set = new TreeSet<>();
        set.add("abc");
        set.add("abd");
        set.add("def");
        set.add("deg");
        set.add("ehi");

        for(String obj : set){
            System.out.print(obj + " ");
        }
    }
}
