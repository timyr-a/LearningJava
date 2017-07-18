package bubbleSort;

import java.util.Random;

/**
 * Created by User on 13.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        final byte size = 10;
        fillAndSortArray(size, 1, 100, true);
        fillAndSortArray(size, 25, 75, false);
        /*
        System.out.println("Сортировка по возрастанию");
        int[] array1 = new int[size];
        fillArray(array1, 1, 100);
        printArray(array1);
        bubbleSort(array1);
        printArray(array1);
        System.out.println("Сортировка по убыванию");
        int[] array2 = new int[size];
        fillArray(array2, 25, 75);
        printArray(array2);
        bubbleSort(array2, false);
        printArray(array2);
        */
    }

    private static void fillAndSortArray(byte size, int minValue, int maxValue, boolean asc) {
        /*
        String description;
        if(asc)
            description = "Сортировка по возрастанию";
        else
            description = "Сортировка по убыванию";
        System.out.println(description);
        */
        System.out.println(asc
                ? "Сортировка по возрастанию"
                : "Сортировка по убыванию");

        int[] array1 = new int[size];
        fillArray(array1, minValue, maxValue);
        printArray(array1);
        bubbleSort(array1, asc);
        printArray(array1);
    }

    static void fillArray(int[] massiv, int minValue, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(maxValue - minValue) + minValue;
        }
    }

    static void printArray(int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
    }

    @Deprecated
    static void bubbleSort(int[] massiv) {
        bubbleSort(massiv, true);
    }

    static void bubbleSort(int[] massiv, boolean asc) {
        for (int i = massiv.length - 1; i > 0; i--) {
            // проход по несортированной части
            for (int j = 0; j < i; j++) {
                // проверка и обмен местами соседних элементов
                /*
                if ((asc && massiv[j] > massiv[j + 1])
                        || (!asc && massiv[j] < massiv[j + 1])) {
                */
                if (asc == massiv[j] > massiv[j + 1]
                        || !asc == massiv[j] < massiv[j + 1]) {
                    int tmp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = tmp;
                }
            }
        }
    }
}
