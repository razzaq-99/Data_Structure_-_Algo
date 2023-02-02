
public class StacksL {
    Node head;

    static class Node {
        int  data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }


    }

    static class Stack {
        public static Node head;

        public  boolean isEmpty() {
            return head == null;
        }

        public  void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public  int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty:");
            }
            int top = head.data;
            head = head.next;

            return top;
        }

        public  int peek() {
            if (isEmpty()) {
                System.out.println("stack is empty:");
            }
            return head.data;

        }
    }

        public static void main(String[] args) {
            Stack s = new Stack();
            System.out.println(s.isEmpty());
             s.push(1);
             s.push(2);
             s.push(3);
             s.push(4);
             s.push(5);

             while(!s.isEmpty()){

                 System.out.println(s.peek());
                 s.pop();

             }

        }

}
