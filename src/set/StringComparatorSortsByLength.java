package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StringComparatorSortsByLength implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        /*

        -ve : o1 has to come before o2
        +ve : o1 has to come after o2
        0   : if both o1 and o2 are same

         */

        if(o1.length() < o2.length())
            return -1;
        else if(o1.length() >o2.length() )
            return 1;
        // if lengths are equal used default ordering
        // of strings
        return o2.compareTo(o1);
    }

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new StringComparatorSortsByLength());
        set.add("abc");
        set.add("ahgh");
        set.add("ad");
        set.add("bcd");

        System.out.println(set);
        // [ad, bcd, abc, ahgh]
    }
}
