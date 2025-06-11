package Arrays;
import java.util.*;
public class maxMinMatrix {

    public static void findMinMax(int arr[][]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        
        System.out.println("Minimum element is: "+ min);
        System.out.println("Maximum element is: "+ max);
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        findMinMax(arr);
        sc.close();
    }
}
