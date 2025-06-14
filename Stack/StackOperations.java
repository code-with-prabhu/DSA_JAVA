package Stack;

import java.util.ArrayList;

public class StackOperations {
    static class StackDs{
        ArrayList <Integer> list = new ArrayList<>();
    
    public boolean isEmpty(){
        return list.size() == 0;
    }
    public void push(int data){
        list.add(data);
    }
    public int pop(){
        if (list.size() == 0) {
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size()-1);
        return top;
    }
    public int peek(){
        if (list.size() == 0) {
            return -1;
        }
        return list.get(list.size()-1);
    }
}

    public static void main(String[] args) {
        StackDs s = new StackDs();
        s.push(1);
        s.push(2);
        s.push(3);
        s.isEmpty();
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
    }

}
