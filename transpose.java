package Arrays;
import java.util.*;
public class transpose {
    public static void transposeMat(int arr[][]){
        int b[][] =  new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                b[j][i] = arr[i][j];
            }
        }
        System.out.println("transpose matrix");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row size: ");
        int row = sc.nextInt();
        System.out.println("enter the column size: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("enter the matrix element");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        transposeMat(arr);
        sc.close();
    }
    
}
