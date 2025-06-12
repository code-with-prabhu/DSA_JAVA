package Bitmanipulation;
import java.util.*;
public class bitOperation {
    public static int getIthbit(int n, int i){
        int BitMask = 1<<i;
        if ((n&BitMask) == 0) {
            return 0;
        } 
        else{
            return 1;
        }
    }
    public static int setIthbit(int n, int i){
        int BitMask = 1<<i;
        return (n|BitMask);
    }

    public static int clearIthbit(int n, int i){
        int BitMask = ~(1<<i);
        return (n&BitMask);
    }
    public static int updateIthbit(int n, int i,int value){
        if (value==0) {
            clearIthbit(n, i);
        }
        else{
            setIthbit(n, i);
        }

        // another method

        n = clearIthbit(n, i);
        int newBit = value<<i;
        return (n|newBit);
    }
    public static int clearIthBits(int n, int i){
        int bitMask = (~0)<<i;
        return (n&bitMask);
    }

    public static int clearRangeBits(int n, int i, int j){
        int bitMask = ((~0)<<j+1)|(1<<i - 1);
        return (n&bitMask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number and index where you want to do a operation: ");
        //int n = sc.nextInt();
        //int i = sc.nextInt();
        //System.out.println(clearIthBits(n, i));
        System.out.println(clearRangeBits(10, 2, 4));
        sc.close();
    }
}
