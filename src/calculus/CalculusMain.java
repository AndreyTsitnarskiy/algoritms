package calculus;

import java.util.ArrayList;
import java.util.List;

public class CalculusMain {
    public static void main(String[] args) {

        String expr = getIntRadix(345363232,16);
        String expr1 = getIntRadix(345363232,2);
        int result = getIntTenRadix(expr, 16);
        int result1 = getIntTenRadix(expr1, 2);
        System.out.println(expr);
        System.out.println(result);
        System.out.println(expr1);
        System.out.println(result1);

    }

    public static String getIntRadix(int number, int radix) {
        List<Character> digits = getDigits();
        if(radix < 2 || radix >= digits.size() || number < 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            sb.insert(0, digits.get(number % radix));
            number /= radix;
        }
        return sb.toString();
    }

    public static int getIntTenRadix(String number, int radix) {
        List<Character> digits = getDigits();
        char[] num = number.toCharArray();
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            int j = digits.indexOf(num[i]);
            result += j * Math.pow(radix, num.length - i - 1);
        }
        return result;
    }

    public static List<Character> getDigits() {
        ArrayList<Character> digits = new ArrayList<>();
        for (char i = '0'; i <= '9'; i++) {
            digits.add(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            digits.add(i);
        }
        return digits;
    }
}
