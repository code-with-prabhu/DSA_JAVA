package Arrays;

public class TrappingRainwater {
    public static int trappedWater(int arr[]){
        int n = arr.length;
        //leftMax subArray
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i =1;i<arr.length;i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        //Rightmax Subarray
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i = n-2; i>=0;i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        //loop -> calculate waterlevel -> calculate trapped water
        int waterTrapped = 0;
        for(int i=0 ;i<n;i++){
          int waterLevel = Math.min(leftMax[i], rightMax[i]);
            waterTrapped+=(waterLevel-arr[i]);
        }
        return waterTrapped;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
    
}
