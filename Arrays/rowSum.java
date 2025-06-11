package Arrays;

public class rowSum {
    public static int sumRow(int arr[][], int row){
        int sum = 0;
        for(int i=0;i<arr[0].length;i++){
            sum += arr[row][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int row = 1;
        System.out.println("sum of all element of row "+ row + " is "+ sumRow(arr, row));
    }
}
