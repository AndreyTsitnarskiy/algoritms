package sortByChoiсe;

public class SortByChoiсe {

    private static int minValue(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int[] sortByChoiсe(int[] array) {
        for (int step = 0; step < array.length; step++) {
            int index = minValue(array, step);

            int temp = array[step];
            array[step] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
