package Bitmanipulation;

public class Corona {
    public static int[] operation(int arr[], int spikes){
        for(int i=0; i<arr.length;i++){
            arr[i] = arr[i] >> 2;
        }
        return arr;
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {16,32,64,72,80};
        int spikes = 2;
        printArr(operation(arr, spikes));
    }
}
