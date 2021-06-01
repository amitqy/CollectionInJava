package sortingObjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>();
        set.add(new Employee(100, "Obama"));
        set.add(new Employee(400, "Tom"));
        set.add(new Employee(800, "Bharath"));


        for (Employee employee : set) {
            System.out.print(employee.id + " ");
        }
        // Sorted by id
        // 100 400 800
        Set<Employee> set1 = new TreeSet<>(new EmployeeNameComparator());
        set1.add(new Employee(100, "Obama"));
        set1.add(new Employee(400, "Tom"));
        set1.add(new Employee(800, "Bharath"));

        System.out.println();
        // Sorts by name
        for (Employee employee : set1) {
            System.out.print(employee.name + " ");
        }
        // Sorted by name
        // Bharath Obama Tom


    }
}
