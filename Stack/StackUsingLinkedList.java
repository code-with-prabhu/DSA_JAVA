package Stack;

public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class StackLL{
        static Node head =  null;
        static int size;

        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            size++;
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        StackLL s = new StackLL();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
