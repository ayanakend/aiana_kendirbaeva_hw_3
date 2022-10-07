import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] nums = {13.7, 7.0, 58.3, 3.1, 15.5, 67.0, 34.0, 21.9, 0.4, -89.5, 10.0, 6.6, 9.1, 12.2, 5.5};
        double result = 0;
        boolean firstNegativeFound = false;

        for (double i : nums) {

            if (!firstNegativeFound) {
                firstNegativeFound = true;
                continue;

            }
            result += i;
        }
        System.out.println("Среднеее арифметическое = " + result / nums.length);
        System.out.println("----------------------------");


        int[] array = {10, 2, -10, 3, 1, -3, 5};
        System.out.println("Начальный ряд чисел: " + Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println("Финальный ряд чисел: " + Arrays.toString(array));
    }

}



