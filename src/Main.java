import bobbleSort.BobbleSort;
import findMin.FindMin;

import java.util.Arrays;

public class Main {

    private static int[] array = {23,54,12,54,76,86,123,43,546,76,23,77,321,43,232,16};

    public static void main(String[] args) {

        FindMin.findMin(array);
        System.out.println(Arrays.toString(BobbleSort.bobbleSort(array)));
    }
}