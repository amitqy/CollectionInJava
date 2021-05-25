package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(12);
        arrayList2.add(23);
        Iterator<Integer> itr = arrayList2.iterator();
        // Iterator can thought as initially it points
        // to -1 index.
        // Iterator can loop through any collection
        // hasNext() -> returns true if there are more objects
        // in the collection else false
        // next() -> returns the next object in the collection
        while (itr.hasNext()){
            System.out.println(itr.next());
            // remove at which iterator refers
            itr.remove();
        }
        System.out.println(arrayList2);



    }
}
