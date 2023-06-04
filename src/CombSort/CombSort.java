package CombSort;

import java.util.ArrayList;
import java.util.Random;

public class CombSort {
    public static void main(String[] args) {
        int[] taskArray = new int[100000];

        for (int i = 0; i < taskArray.length; i++) {
            taskArray[i] = new Random().nextInt(100000);
        }

        int[] array1 = taskArray;
        int[] array2 = taskArray;
        int[] array3 = taskArray;

        long start = System.currentTimeMillis();

        System.out.println(System.currentTimeMillis() - start);

        long start1 = System.currentTimeMillis();

        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();

        System.out.println(System.currentTimeMillis() - start2);

    }
}
