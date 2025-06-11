package Arrays;
import java.util.*;
public class searchMatrix {
    public static int searchKey(int arr[][], int key){
        int row = arr.length-1, col = 0;
        while (row>=0 && col<arr[0].length) {
            if(arr[row][col] == key){
                System.out.println(key + " found at ("+ row +" , "+col+") index");
                break;
            }
            else if (key<arr[row][col]) {
                row--;
            }
            else{
                col++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } }; 
        int key = sc.nextInt();
        int x = searchKey(arr, key);
        if (x == -1) {
            System.out.println(key+ " is not found!");
        }
        sc.close();
    }
}
