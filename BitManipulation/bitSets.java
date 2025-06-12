package Bitmanipulation;
import java.util.*;
public class bitSets {
    public static int countBitSet(int n){
        int count=0;
        while(n > 0){
            if ((n&1)==1) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        System.out.println(countBitSet(n));
        sc.close();
    }
}
