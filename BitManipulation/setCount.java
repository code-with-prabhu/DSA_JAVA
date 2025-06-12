package Bitmanipulation;
import java.util.Scanner;
public class setCount {
    public static int count(int n){
        int count = 0;
        while (n >0) {
            count += n&1;
            n >>= 1;
        }
        return count;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int n = sc.nextInt();
    System.out.println(count(n));
    sc.close();
   } 
}
