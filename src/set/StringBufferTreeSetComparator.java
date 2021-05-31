package set;

import java.util.Comparator;

public class StringBufferTreeSetComparator implements Comparator<StringBuffer> {
    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        // convert o1 an o2 to strings
        String s1 = o1.toString();
        String s2 = o2.toString();
        // String already has compareTo, which does natural
        // ordering
        // Wee need to use this comparator
        return s1.compareTo(s2);
    }
}
