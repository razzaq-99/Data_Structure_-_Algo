import java.util.Arrays;

public class BottomElement {

        private int size;
        private int top;
        private int[] stack;

        public BottomElement(int size) {
            this.size = size;
            this.top = -1;
            this.stack = new int[this.size];
        }

        public boolean isEmpty() {
            return (top == -1);
        }

    public boolean isFull() {
        return (top == this.size - 1);
    }

    public void push(int item) {
            if (isFull()) {
                System.out.println("Stack overflow");
            }
                else{
                stack[++top] = item;
            }
        }

        public int removeBottom() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            else{
                int temp = stack[0];
                for(int i=0; i<top; i++){
                    stack[i] = stack[i+1];
                }
                top--;
                return temp;
            }
        }

    @Override
    public String toString() {
        return
                "stack = " + Arrays.toString(stack)
                ;
    }

    public static void main(String[] args) {
        BottomElement b1 = new BottomElement(3);
        b1.push(1);
        b1.push(2);
        b1.push(3);


            System.out.println(b1);

        System.out.println(b1.removeBottom());

    }
    }

