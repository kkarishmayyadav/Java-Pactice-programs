import java.util.Stack;

public class StackB {
    //Stack through ArrayList

    /* 
    static ArrayList<Integer> list=new ArrayList<>();  //create arraylist 

    public boolean isEmpty() {
        return list.size()==0; //reutrn fasle if list is empty
    }
    public void push(int data){
        list.add(data);  //push data in arraylist
    }

    public int pop() {
        if(isEmpty()){   //Check if list is empty return -1
            return -1;
        }
        int top=list.get(list.size()-1); //save data at last index of array list in top
        list.remove(list.size()-1);     // remove data from last index if arraylist
        return top; //return data of last index
        
    }

    public int peek() {
        return list.get(list.size()-1);     // return data from last index of arraylist
        
    }

    */

    // stack through linkedlist

   /*/ 
       
static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class StackB{
        static Node head=null;

        public static boolean isEmpty() {
            return head==null;
        }

        public static void push(int data) {
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }

            newNode.next=head;
            head=newNode;
            return;
            
        }

        public static int pop() {
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head=head.next;
            return top;
        }

        public static int peek() {
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }
    }

*/

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);   //push data in stack
        s.push(2);
        s.push(3);
        s.push(4);
       
        while(!s.isEmpty()){
            System.out.println(s.peek());   
            s.pop();
        } 
        
    }
}
