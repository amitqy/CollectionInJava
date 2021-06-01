package maps;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        // LinkedHashMap maintains the insertion order
        // and does not sort

        map.put("John",70);
        map.put("holly",80);
        map.put("lee",99);
        map.put("Abraham", 20);
        map.put("Ram",100);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        // [John, holly, lee, Abraham, Ram]
        // They in their insertion order, not sorted

        // To get all the values in the map
        Collection<Integer> values = map.values();
        System.out.println(values);
        // [70, 80, 99, 20, 100]

        System.out.println();
        // Get all values for all keys
        for(String key: keys){
            System.out.println(key + ": "  + map.get(key) + " ");
        }
       //   John: 70
       //   holly: 80
       //   lee: 99
       //   Abraham: 20
       //   Ram: 100


    }

}
