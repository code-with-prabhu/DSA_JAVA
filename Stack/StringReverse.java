package Stack;

import java.util.Stack;

public class StringReverse {
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i<str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "atiprabhu";
        System.out.println(reverseStr(str));
    }
}
