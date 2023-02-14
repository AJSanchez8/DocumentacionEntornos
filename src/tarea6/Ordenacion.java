package tarea6;

/**
 * @author Antonio José Sánchez González
 * @version 1.1.1.1
 */

public class Ordenacion {

    /**
     * @param array
     * Metodo ordenacion
     */
    public void sortArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                if (array[j + 1] > array[maxValue]) {
                    maxValue = j + 1;
                }
            }
            swap(array, i, maxValue);
            printArray(array);
        }
    }

    /**
     *
     * @param numbers
     * @return numbers
     * Metodo de ordenacion 2
     */
    public int[] sortArray2(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int auxiliar = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = auxiliar;
                }
            }
        }
        return numbers;
    }

    /**
     *
     * @param array
     * Metodo para mostrar Array
     */
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d \t", array[i]);
        }
        System.out.println();
    }

    /**
     *
     * @param array
     * @param a
     * @param b
     * Metodo para cambiar los valores del array
     */
    public void swap(int[] array, int a, int b) {
        int value = array[b];
        array[b] = array[a];
        array[a] = value;
    }
}
