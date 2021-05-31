package set;

import java.util.*;

public class DifferentSets {

    public static void main(String[] args) {

        // Task: Generate random numbers and insert them in hashset
        Random obj = new Random();
        HashSet<Integer> set = new HashSet();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("Order of Insertion");
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        for(int i = 0; i < 5; i++){
             int number = obj.nextInt(100);
             set.add(number);
             linkedSet.add(number);
             treeSet.add(number);
             System.out.print(number + " ");
        }
        System.out.println();
        // Notice that the HashSet does not maintain the order of insertions
        System.out.println("HashSet elements: " + set);
        // Notice that the HashSet maintains the order of insertions
        System.out.println("LinkedHashSet elements: " + linkedSet);
        // Notice that the treeSet sorts the elements while they are
        // inserted in ascending order
        System.out.println("TreeSet elements: " + treeSet);
    }

}
