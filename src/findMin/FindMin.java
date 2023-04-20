package findMin;

public class FindMin {

    public static void findMin(int array[]) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Минимальное число в массиве: " + min + " индекс: " + minIndex);
    }
}
