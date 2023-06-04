package CombSort;

public class KnuthSort implements SomeAlgorithms {
    @Override
    public int[] sort(int[] array) {
        int k = 1;
        int j = array.length;
        while (k > 0) {
            k = 0;
            for (int i = 1; i < j; i++) {
                if (array[i -1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    k = i;
                }
            }
            j = k;
        }
        return array;
    }
}
