
import java.util.*;
import java.util.Stack;

public class StacksCollection {

    public static void pushAtBottom(int data, Stack<Integer> ss){
       if(ss.empty()){
           ss.push(data);
           return;
       }
       int top = ss.pop();
       pushAtBottom(data, ss);
       ss.push(top);

    }
    public static void reverse(Stack<Integer> ss){
        if(ss.empty()){
            return;
        }
        int top = ss.pop();
        reverse(ss);
        pushAtBottom(top,ss);
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);

//       pushAtBottom(5,s);

        reverse(s);

         while(!s.empty()){
//             System.out.println(s.peek());

             System.out.println(s.pop());
//             System.out.println(s.pop());
//             System.out.println(s.empty());
         }
    }
}
