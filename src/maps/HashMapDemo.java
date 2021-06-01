package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John",70);
        map.put("holly",80);
        map.put("lee",99);
        map.put("Ram",100);

        // To get all the keys in the map
        Set<String> keys = map.keySet();
        System.out.println(keys);
        // [John, lee, holly, Ram]
        // Note that keys are not ordered
        // Neither they in their insertion order

        // To get all the values in the map
        Collection<Integer> values = map.values();
        System.out.println(values);
        // [70, 99, 80, 100]

        System.out.println();
        // Get all values for all keys
        for(String key: keys){
            System.out.println(key + ": "  + map.get(key) + " ");
        }
        // John: 70
        // lee: 99
        // holly: 80
        // Ram: 100


    }
}
