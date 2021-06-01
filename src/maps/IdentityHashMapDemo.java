package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String > map = new HashMap<>();

        Integer id1 = new Integer(10);
        Integer id2 = new Integer(10);

        // These two objects points to different memories
        // But their contents are same

        map.put(id1,"BMW");
        map.put(id2,"Audi");

        System.out.println(map);
        // Latest key and value is only stored
        // First {key,value} is overridden
        // Because both key contents are same
        // It uses equals() comparison
        // So it checks the values, values are same
        // {10=Audi}

        Map<Integer,String > map1 = new IdentityHashMap<>();
        map1.put(id1, "BMW");
        map1.put(id2, "Audi");
        System.out.println(map1);
        // Both keys point to different memories
        // No first {key,value} is not overridden this time
        // It uses == comparison
        // So it checks the references, and they were diff
        // {10=BMW, 10=Audi}



    }
}
