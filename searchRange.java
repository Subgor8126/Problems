package neuepacken;
import java.util.Scanner;

//GENIUS CODE, WRITTEN ORIGINALLY BY ME
public class searchRange {
    public static void main(String[] args) {
        int[] arr = {2,435,42,10,687,5,96,23};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter search term: ");
        int target = in.nextInt();
        System.out.print("Enter start index: ");
        int start = in.nextInt();
        System.out.print("Enter end index: ");
        int end = in.nextInt();
        rangeSearch(target, start, end, arr);
    }

    static void rangeSearch(int target, int start, int end, int[] arr){
        if (arr.length == 0){
            System.out.println("Array length must be non-zero!");
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target){
                System.out.println("Element found at index "+(i-start)+" in the specified range in the array, and at index "+i+" in the original array.");
                return;
            }
        }
        System.out.println("Element not found in the specified range in the array!");
    }
}
