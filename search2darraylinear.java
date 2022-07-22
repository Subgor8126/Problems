package neuepacken;
import java.util.Arrays;
public class tester {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 8;
        int[] ans = search2d(arr2d, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2d(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(Arrays.toString(arr2d[j])+" ");
                if (arr[i][j] == target){
                    System.out.print("Element found at index ");
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
