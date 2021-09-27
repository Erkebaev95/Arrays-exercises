import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {

        // Как поменять элементы массива в обратном порядке
        // Первый способ
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        System.out.println(Arrays.toString(arr));

        // Второй способ
        String[] arr2 = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
        //Выводим изначальный массив в консоль
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]);
        }
        System.out.println();

        int n = arr2.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = arr2[n - i - 1];
            arr2[n - i - 1] = arr2[i];
            arr2[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]);
        }
    }
}