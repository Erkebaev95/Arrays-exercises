import java.util.Arrays;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {

        // Создать второй массив из четных элементов первого массива
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int n = 0;

        while (n <= 3) {
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n <= 3){
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int[] arr1 = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            arr1[i] = (int)(Math.random()*(n+1));
            if(arr1[i] % 2 == 0){
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(arr1[i] % 2 == 0){
                arr2[index] = arr1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}