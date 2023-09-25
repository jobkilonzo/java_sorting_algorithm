import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args){
        int[] numbers = {1, 2, 4, 5, 7, 9, 11};

        Scanner scanner = new Scanner(System.in);
        int numberToSearch = scanner.nextInt();

        System.out.println(binarySearch(numbers, numberToSearch, 0, numbers.length));
    }
    private static int binarySearch(int[] numbers, int numberToSearch, int low, int high) {
        if (high >= low && low <= numbers.length - 1) {

            int middleIndex = low + (high - low) / 2;
            int middleNumber = numbers[middleIndex];
            if (numberToSearch == middleNumber) {
                return middleIndex;
            }
            if (numberToSearch < middleNumber) {
                return binarySearch(numbers, numberToSearch, low, middleIndex - 1);

            } else {
                return binarySearch(numbers, numberToSearch, middleIndex + 1, high);

            }


        }
        return -1;
    }
}
