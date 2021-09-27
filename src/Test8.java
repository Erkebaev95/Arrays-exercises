import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {

        // Среднее арифметическое элементов массива
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < 5; i++) {
            arr1[i] = (int) (Math.random() * 6);
            arr2[i] = (int) (Math.random() * 6);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += arr1[i];
            average2 += arr2[i];
        }
        average1 /= 5;
        average2 /= 5;

        if (average1 > average2) {
            System.out.println("Среднее арифметическое первого массива ("+ average1 +") больше среднего арифметического " +
                    "второго массива ("+ average2 +")");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое первого массива ("+ average1 +") меньше среднего арифметического " +
                    "второго массива ("+ average2 +")");
        } else {
            System.out.println("Средние арифметические массивов равны ("+ average1 +")");
        }
    }
}