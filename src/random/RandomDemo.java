package random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random obj = new Random();
        int x = obj.nextInt();
        System.out.println("x: " + x);

        // An upper bound is set on next random number
        // generated
        int y = obj.nextInt(100);
        System.out.println("y: " + y);

    }
}
