package Arrays;

public class subArrays {

    public static void printSubarray(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i] + arr[i];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        System.out.println("maxSum = "+maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,7,-1,8};
        printSubarray(arr);
    }
}
