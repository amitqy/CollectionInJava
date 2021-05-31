package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        // ListIterator helps to traverse a list in
        // forward and backward direction

        List<String> list = new LinkedList<>();
        list.add("I am ");
        list.add("Wall");
        list.add(" E");


        ListIterator<String> iterator = list.listIterator();
        System.out.println("Traversing in forward direction");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // I am  Wall  E
        System.out.println();
        System.out.println("Traversing in backward direction");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous()+ " ");
        }
        //  E Wall I am
    }
}
