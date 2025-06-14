package Stack;

import java.util.Stack;

public class ReverseSatck {
    public static void buttomPush(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        buttomPush(s, data);
        s.push(top);
    }
    public static void stackReverse(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        stackReverse(s);
        buttomPush(s, top);
    } 
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        stackReverse(s);
        System.out.println(s);
    }
}
