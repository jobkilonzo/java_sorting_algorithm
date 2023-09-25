import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Before:");
        printArray(numbers);
        mergeSort(numbers);
        System.out.println("After:");
        printArray(numbers);

    }

    private static void mergeSort(int[] numbers) {
        int arrayLength = numbers.length;


        if (arrayLength < 2){
            return;
        }
        int middlePoint = arrayLength /2;

        int[] lA = new int[middlePoint];
        int[] rA = new int[arrayLength - middlePoint];

        for (int i = 0; i < middlePoint; i++){
            lA[i] = numbers[i];
        }
        for (int i = middlePoint; i < arrayLength; i++){
            rA[i - middlePoint] = numbers[i];
        }

        mergeSort(lA);
        mergeSort(rA);

        merge(numbers, lA, rA);
    }

    private static void merge(int[] numbers, int[] lA, int[] rA) {
        int i = 0, j = 0, k = 0;

        int rightSize = rA.length;
        int leftSize = lA.length;

        while (i < leftSize && j < rightSize){
            if (lA[i] < rA[j]){
                numbers[k] = lA[i];
                i++;
            }else {
                numbers[k] = rA[j];
                j++;
            }
            k++;
        }

        while (i < leftSize){
            numbers[k] = lA[i];
            i++;
            k++;
        }

        while (j<rightSize){
            numbers[k] = rA[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] numbers) {
        for (int arrayItems: numbers){
            System.out.println(arrayItems);
        }
    }
}
