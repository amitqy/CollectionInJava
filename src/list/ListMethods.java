package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {

        // Using run time polymorphism
        List<Integer> list = new ArrayList<>();

        for(int i =10; i <=100; i=i+10){
            list.add(i);
        }
        System.out.println("List: " + list);

        // Insert 100 at index 2
        list.add(2,100);

        // Replace value at index 3
        list.set(3,200);

        System.out.println("List after replacement: " + list);

        // Task: Add whole list to other list
        List<Integer> secondList = new ArrayList<>();
        secondList.add(12);
        secondList.add(123);
        secondList.add(424);
        secondList.add(624);

        System.out.println("Second List: " + secondList);

        list.addAll(4,secondList);
        System.out.println("List after adding secondList to List at its 4th index: " + list);

        // Task : Search an element in list

        if(list.contains(10)){
            System.out.println("present");
        }
        else {
            System.out.println("not present");
        }

        // Task : How to get, remove from List

        // Get element
        for (int i = 0; i < list.size(); i++){
            // get(i) gets element from index i
            System.out.print(list.get(i));
            System.out.print(" ");
        }

        System.out.println();

        // Remove element at index 3
        list.remove(3);

        System.out.println("List after deletion: " + list);

    }
}
