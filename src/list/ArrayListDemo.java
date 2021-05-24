package list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // ArrayList is raw type here
        // this can cause run time issues
        ArrayList list = new ArrayList();
        list.add(new Integer(20));
        list.add(10);
        list.add(30.56);
        list.add("hello");

        // Because it is raw type I need to add casting,
        // otherwise compile time error comes
        // String x =list.get(3);

        // correct way
        String output =(String) list.get(3);

        System.out.println(output);

        // If I assumed all data types are integer, coz majority
        // in this case were and added cast of String to 4th element

        // I will get run time error

        // Gives no compile time error,
        // even though element there is a string
        Integer output2 =(Integer) list.get(3);

        // But gives run time error
        System.out.println(output2);

        // To prevent this we need to restrict the list a datatype only

        // Restricted this list to Integer datatype
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(12);
        arrayList2.add(23);

        //  Now this is restricted to be inserted,
        //  as it gives run time error
        //  arrayList2.add("jhjhjk");
    }
}
