package Arrays;
import java.util.*;

public class search {
    public static int linear_search(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binary_search(int arr[], int target){
        int st=0;
        int end = arr.length-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter the size of array:");
        int size = sc.nextInt();
        System.out.println("enter the elements of array");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int target = sc.nextInt();
        int index = linear_search(arr, target);
        System.out.println("element "+target+" found at "+ index+ " index.");

        int index_bs = binary_search(arr, target);
        System.out.println("element "+target+" found at "+ index_bs+ " index.");
        sc.close();

    }
}
