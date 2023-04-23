package quickSort;

public class QuickSort {

    public static int[] quickSort(int[] array, int start, int end) {
        if(start < end){
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot, end);
        }
        return array;
    }

    private static int partition(int[] array, int start, int end) {
        int leftIndex = start;
        int rightIndex = end;

        int pivot = array[start];
        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
