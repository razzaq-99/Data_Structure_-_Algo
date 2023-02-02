public class ArrayStacks {
//        Object stackss[];
//        int top;
//        int size;
//
//        public ArrayStacks(int size)
//        {
//            this.size = size;
//            stackss = new Object[this.size];
//            top = -1;
//        }
//
//        public void push(int x)
//        {
//            if (top == size - 1)
//            {
//                System.out.println("Stack Overflow");
//            }
//            else
//            {
//                stackss[++top] = x;
//                System.out.print(x+" ");
//
//            }
//
//        }
//
//        public boolean equals(ArrayStacks stack2)
//        {
//            if (top != stack2.top)
//                return false;
//
//            for (int i = 0; i <= top; i++)
//                if (stackss[i] != stack2.stackss[i])
//
//                    return false;
//
//            return true;
//        }
//    }
//
//    class Main
//    {
//        public static void main(String[] args)
//        {
//            ArrayStacks stack1 = new ArrayStacks(3);
//            ArrayStacks stack2 = new ArrayStacks(3);
//
//
//            stack1.push(7);
//            stack1.push(8);
//            stack1.push(9);
//
//            stack2.push(7);
//            stack2.push(8);
//            stack2.push(9);
//
//
//            System.out.println(stack1.equals(stack2));
//        }


      private  int size;
       private int top;
       private Object [] stack;
        public ArrayStacks(int cap){
            this.size = size;

            this.stack = new Object[cap];
            this.top = -1;
        }

        public boolean isEpmty(){
            return (top==-1);
        }
        public Object pop(){
            if(!isEpmty()){
                return stack[top--];
            }
            else System.out.println("Stack is empty:");
            return 0;
        }

        public void push(int val){
            stack[++top]=val;
        }

        public String toString(){
            String result = "";
            while(top>-1){
                result = result+ pop() +" ";

            }
            return result;
        }

        public boolean equals(ArrayStacks stack2){
            if(top!= stack2.top)
                return false;

            for(int i=0; i<=top; i++) {
                if (stack[i] != stack2.stack[i])
                    return false;
            }
                return true;

        }

    public static void main(String[] args) {
        ArrayStacks a1 = new ArrayStacks(3);
        ArrayStacks a2 = new ArrayStacks(3);

        a1.push(1);
        a1.push(2);
        a1.push(3);

        a2.push(1);
        a2.push(2);
        a2.push(3);

//        System.out.println(a1.toString());
        System.out.println(a1.equals(a2));
    }

    }


