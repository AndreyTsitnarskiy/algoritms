package fint2minElement;

public class Find2minElement {
    public static void main(String[] args) {
        int[] arr = {2364, 212, 434, 1234, 335, 643, 27, 118, 998, 1670};
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int index = 0;
        int index2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min2 = min;
                min = arr[i];
                index = i;
            } else if (arr[i] < min2 && arr[i] != min) {
                min2 = arr[i];
                index2 = i;
            }
        }
        if (min2 != Integer.MAX_VALUE){
            System.out.println("2 min index element is " + index2 + " and value is " + min2);
            System.out.println("1 min index element is: " + index + " and value is " + min);
        } else {
            System.out.println("No 2 min element");
        }
    }
}
