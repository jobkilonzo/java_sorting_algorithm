import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Before:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After:");
        printArray(numbers);
    }

    private static void insertionSort(int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < length -1; i++){
            int min = numbers[i];
            int indexOfMin = i;

            for (int j = i + 1; j < length; j++){
                if (numbers[j] < min){
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }

    }

    private static void swap(int[] numbers, int i, int indexOfMin) {
        int temp = numbers[i];
        numbers[i] = numbers[indexOfMin];
        numbers[indexOfMin] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int arrayItems: numbers){
            System.out.println(arrayItems);
        }
    }
}
