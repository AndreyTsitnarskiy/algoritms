package Eratosfen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratosfen {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(isPrime(1000).toArray()));
    }

    private static List<Integer> isPrime(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        List<Integer> prime = new ArrayList<>();

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                prime.add(i);
            }
        }
        return prime;
    }

}
