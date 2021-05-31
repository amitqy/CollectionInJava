package set;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {
    public static void main(String[] args) {

        Set<StringBuffer> set = new TreeSet<>();

        // Won't let us add StringBuffers inside TreeSet
        // gives runtime error
        // set.add(new StringBuffer("hi"));
        // set.add(new StringBuffer("Iam"));
        // set.add(new StringBuffer("WALL,E"));


        // for (StringBuffer obj: set) {
        //     System.out.println(obj);
        //     Throws error in Java 8
        //     Exception in thread "main" java.lang.ClassCastException
        //     java.lang.StringBuffer cannot be cast to java.lang.Comparable
        //     Any class that we need to add to treeSet should either provide
        //     an implementation of comparator or class itself should
        //     implement comparable interface
        //  }


        Set<StringBuffer> set1 = new TreeSet<>(new StringBufferTreeSetComparator());
        set1.add(new StringBuffer("hi"));
        set1.add(new StringBuffer("Iam"));
        set1.add(new StringBuffer("WALL,E"));

        for( StringBuffer obj : set1){
            System.out.println(obj);
        }

//        Iam
//        WALL,E
//        hi





    }
}
