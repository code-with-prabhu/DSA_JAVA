package Bitmanipulation;

public class NoOfBittoFlipped {
    public static int noOfFilpedtogetSameNumber(int a, int b){
        int n = a ^ b;
        int count = 0;
        while(n > 0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 29;
        int k = 15;
        System.out.println("No of bit to flipped = "+ noOfFilpedtogetSameNumber(n, k));
    }
}
