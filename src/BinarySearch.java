import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int[] numbers = {1, 2, 4, 5, 7, 9, 11, 12};

        Scanner scanner = new Scanner(System.in);
        int numberToSearch = scanner.nextInt();

        System.out.println(binarySearch(numbers, numberToSearch));
    }
    private static int binarySearch(int[] numbers, int numberToSearch){
        int low = 0;
        int high = numbers.length;
        System.out.println(numbers.length);

        while (low<=high){
            int middleIndex = (low + high) /2 ;
            int middleNumber = numbers[middleIndex];
            if (numberToSearch == middleNumber){
                return middleIndex;
            }
            if (numberToSearch < middleNumber ){
                high = middleIndex -1;

            }else {
                low = middleIndex + 1;

            }
        }

        return -1;
    }
}
