public class TOString {
        private int size;
        private int top;
        private Object[] stack;

        public TOString(int size) {
            this.size = size;
            this.stack = new Object[size];
            this.top = -1;
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public Object pop() {
            if(!isEmpty()) {
                return stack[top--];
            }
            else {
                System.out.println("Stack is empty");
                return 0;
            }

        }

        public void push(int value) {
        stack[++top] = value;
    }


        public String toString() {
            String result = "";
            while(top > -1) {
                result = result + pop() + " ";
            }
            return result;
        }

        public static void main(String[] args) {
            TOString s1 = new TOString(5);

           s1.push(1);
            s1.push(2);
           s1.push(3);
            s1.push(4);
           s1.push(5);

            System.out.println("Elements in Stack : " + s1.toString());

//            System.out.println(s1.isEmpty());
        }


}
