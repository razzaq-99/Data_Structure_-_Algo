public class Linkedlist {

    Node head;

    class Node {
        int data;
        Node next;

//        public Node(int data, Node next) {
//            this.data = data;
//            this.next = null;
//        }
    }

    public void insert(int data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node tem = head;
            while(tem.next!=null){
                tem=tem.next;

            }
            tem.next=node;

        }
    }
    public void show(){
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
             node = node.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);

        ll.show();
    }
}
