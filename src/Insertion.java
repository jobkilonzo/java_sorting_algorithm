import java.util.Random;

public class Insertion {
    public static void main(String[] args){
        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Before:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After:");
        printArray(numbers);
    }

    private static void insertionSort(int[] numbers) {
        for (int i = 1; i <numbers.length; i++){
            int currentValue = numbers[i];

            int j = i - 1;
            while (j >= 0 && numbers[j] > currentValue){
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = currentValue;
        }
    }

    private static void printArray(int[] numbers) {
        for (int arrayItems: numbers){
            System.out.println(arrayItems);
        }
    }
}