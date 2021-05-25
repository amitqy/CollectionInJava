package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    // Linked list had fast insertion and deletion time
    // and slow random access

    public static void main(String[] args) {
        Object[] objects = new Object[1000000];

        for(int i = 0; i < objects.length; i++){
            objects[i] = new Object();
        }
        List<Object> list =new LinkedList<>();
        long start = System.currentTimeMillis();
        for(int i = 0; i < objects.length; i++){
            list.add(objects[i]);
        }
        long end = System.currentTimeMillis();

        System.out.println("It took " + (end-start) + "seconds");



    }
}
