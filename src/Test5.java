public class Test5 {
    public static void main(String[] args) {

        // Найти максимальный элемент в массиве из сгенерированных чисел
        int [] mas = new int[12];
        int maxNumber = -16;
        int maxIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * 31) - 15;
            if(maxNumber <= mas[i]){
                maxNumber = mas[i];
                maxIndex = i;
            }
        }
        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}
