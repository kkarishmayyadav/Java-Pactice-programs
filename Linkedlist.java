public class Linkedlist {

    private static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }  
    }

    public static Node head;
    public static Node tail;
    public static int size=0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            
            return;
        }
        newNode.next=head;
        head=newNode; 
         
    }
   
   
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        
    }
    
    public void printLL() {
        if(head==null){
            System.out.println("Linkedlist is Empty ");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
       System.out.println("Null");
    }
    
    public void add(int data,int index) {
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
    }
   
    public void removelast(){
        if(size==0){
            System.out.println("LL is Empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        Node temp=head;
       for(int i=0;i<size-2;i++){
            temp=temp.next;
       }
       temp.next=null;
       tail=temp;
       size--;
    }
   
    public void remove(int index) {
            if(size==0){
                System.out.println("LL is Empty");
                return;
            }
            if(index==0){
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            int i=0;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
            size--;
    }
   
    public int search(int value) {
        if(size==0){
            System.out.println("ll is Empty");
            return -1;
        }
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data==value)
                return i;
            temp=temp.next;
            i++;
        }
        return -1;
    }
   
    public int helper(Node head,int key) {
        if(head==null){
            return-1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if (idx== -1){
            return -1;
        }
        return idx+1;
    }
    
    public int recursivesearch(int key) {
        return helper(head,key); 
    }
    
    public void reversell() {
        if(head==null){
            System.out.println("linkelist is empty");
        }
        Node prev=null;
        Node curr=head;
        Node next=head.next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            head=prev=curr;
            curr=next;   
        }
        
    }
    
    public void deleteNode(int node) {
        if(head==null){
            System.out.println("Linkedlist is empty");
        }
        int idx=1;
        Node temp=head;
        while(idx<node-1){
                temp=temp.next;
                idx++;
        }
        Node prev=temp;
        temp=temp.next;
        prev.next=temp.next;
        size--;
    }
    
    public Node midOfLL() {
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    
    public void isPallindrome() {
        if(head==null || head.next==null){
            System.out.println("linkedlist is palindrome");
        }
        //find mid of linkedlist
        Node curr=midOfLL();
        //reverse the linkedlist
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //compair two list
        Node left_head=head;
        Node right_head=prev;
        while(left_head!=null && right_head!=null){
            if(left_head.data!=right_head.data){
                System.out.println("not pallindrome");
                break;
            }
            left_head=left_head.next;
            right_head=right_head.next;
        }
        if(right_head==null){
            System.out.println("linkedlist is pallindrome");
            
        }
        
    }

    public Boolean isCycle() {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;
        
    }

    /**
     * 
     */
    public void removeCycle() {
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            prev=fast.next;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow==head && fast==head){
            prev.next=null;
        }
        else{
            prev=null;
            slow=head;
            while(slow!=fast){
                 prev=fast;
                 slow=slow.next;
                 fast=fast.next;
            }
        }
    }

   
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
    //     head=new Node(1);
    //     head.next=new Node(2);
    //    // Node temp=new Node(3);
    //     head.next.next=new Node(3);
    //     head.next.next.next=new Node(4);
    //     head.next.next.next.next=new Node(5);
    //     head.next.next.next.next.next=head;
    //    // head.next.next.next=new Node(4);
    //    // head.next.next.next=head;

       // ll.printLL();
       // System.out.println(size);
        // System.out.println(ll.isCycle()); 
        // ll.removeCycle();
        // ll.printLL();

        Node n=ll.midOfLL();
        System.out.println(n.data);
    }
}
