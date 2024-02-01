public class QueueUsingLL {

    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        static Node head=null;
        static Node rear=null;
        static int size=0;

        //check queue is empity or not

        public boolean isEmpty() {
            return head==null;   
        }

        // add data in queue

        public void add(int data) {
            Node newNode=new Node(data);
            size++;
            if(isEmpty()){
                head=newNode;
                head.next=null;
                rear=head;
                return;
            }

            rear.next=newNode;
            rear=newNode;
            rear.next=null;

        }

        //remove from queue

        public int remove() {
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            int front=head.data;
            head=head.next;
            return front;
            
        }

        //peek in queue

        public int peek() {
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    
    // print queue

    public void print() {
        Node temp=head;
        while(temp!=null){
            
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        QueueUsingLL ll=new QueueUsingLL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.print();
        System.out.println("peek ->"+ll.peek());
        System.out.println("removed ->"+ll.remove());
        ll.print();
        
    }
}
