package Arrays;

public class findNum {
    public static int countNum(int arr[][], int tar){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == tar){
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        int tar = 7;
        System.out.println(tar+" presents "+countNum(arr, tar)+" times.");
    }
    
}
