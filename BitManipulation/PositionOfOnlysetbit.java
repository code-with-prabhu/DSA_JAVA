package Bitmanipulation;

public class PositionOfOnlysetbit {
    public static int position(int n){
        //check if the number is not the power of 2 then return -1;
        if (n<=0 || ((n&(n-1)) != 0)) {
            return -1;
        }
        //then calculate the postion
        int pos = 1;
        while ((n&1) == 0) {
            n >>=1;
            pos++;
        }
        return pos;
    }
    public static void main(String[] args) {
        int n = 8;
        if (position(n) == -1) {
            System.out.println("there is not present only one set bit");
        } else {
            System.out.println("the position of only one set bit is " + position(n));
        }
    }
}
