import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {

        // Заменить каждый элемент массива с нечетным индексом на ноль
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
