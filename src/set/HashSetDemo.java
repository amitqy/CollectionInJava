package set;

import random.RandomDemo;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        // Task: Generate 10 random integers within a range of 5
        // Insert them in ArrayList and HashSet
        Random obj = new Random();
        List<Integer> list = new ArrayList<>();
        // The set interface is implemented by Hashset class
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= 10 ; i++) {
            int number = obj.nextInt(5);
            list.add(number);
            set.add(number);
        }
        System.out.println("ArrayList: " + list);

        // Add full arrayList in set in one go
        // Set<Integer> set = new HashSet<>(list);

        // There will be no duplicates in Hashset
        System.out.println("HashSet: " + set);


    }
}
