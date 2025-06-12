package Bitmanipulation;
import java.util.*;
public class checkpower {
    public static void twosPowerOrNot(int n){
        if ((n&n-1)==0) {
            System.out.println(n+ " can be a Power of two.");
        }
        else{
            System.out.println(n+ " can not be a power of two.");
        }
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number: ");
     int n = sc.nextInt();
     twosPowerOrNot(n);
     sc.close();
    }
}
