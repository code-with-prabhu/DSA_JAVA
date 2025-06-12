package Bitmanipulation;
import java.util.*;
public class evenOdd {
    public static void checkEven(int n){
        int BitMask = 1;
        if((n&BitMask)==0){
            System.out.println(n+" is an even number");
        }
        else{
            System.out.println(n+ " is not an even number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        checkEven(n);
        sc.close();
    }
}
