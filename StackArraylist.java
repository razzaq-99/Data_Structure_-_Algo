import java.util.ArrayList;

public class StackArraylist {

    static class Stacks{
      static  ArrayList<Integer> list = new ArrayList<>();

        static public boolean isEmpty(){
             return list.size()==0;
         }

         public static int push(int data){
             list.add(data);

             return data;
         }

         public static int  pop(){
             if(isEmpty()){
                 System.out.println("list is empty:");
             }
             int top = list.get(list.size()-1);
             list.remove(list.size()-1);
             return top;
         }
         public static int peek(){
             if(isEmpty()){
                 System.out.println("list is empty:");
             }
             return list.get(list.size()-1);
         }
    }

    public static void main(String[] args) {
        Stacks ss = new Stacks();
//        System.out.println(ss.isEmpty());
            ss.push(1);
            ss.push(2);
            ss.push(3);
            ss.push(4);
            while(!ss.isEmpty()){
//                System.out.println(ss.peek());
                System.out.println(ss.pop());
            }
    }
}
