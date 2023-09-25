import java.util.Random;

public class BubleSort {
    public static void main(String[] args){
        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Before:");
        printArray(numbers);

        boolean swapSomething = true;
        while (swapSomething){
            swapSomething = false;
            for (int i = 0; i < numbers.length -1; i++){
               if (numbers[i] > numbers[i + 1]){
                   swapSomething = true;
                   int temp = numbers[i];
                   numbers[i] = numbers[i + 1];
                   numbers[i+1] = temp;
               }
            }
        }

        System.out.println("After:");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int arrayItems: numbers){
            System.out.println(arrayItems);
        }
    }
}
