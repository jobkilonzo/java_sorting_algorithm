import java.util.Random;

public class Quicksort {
    public static void main(String[] args){
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);
        quickSort(numbers, 0, numbers.length -1);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void quickSort(int[] numbers, int i, int i1) {

    }

    private static void printArray(int[] numbers) {
        for (int arrayItem: numbers){
            System.out.println(arrayItem);
        }
    }
}
