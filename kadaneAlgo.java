package Arrays;

public class kadaneAlgo{
    public static void kadane(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0; i<arr.length;i++){
            currentSum += arr[i];
            if(currentSum<0){
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("maxSum = "+maxSum);

    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);
    }
}