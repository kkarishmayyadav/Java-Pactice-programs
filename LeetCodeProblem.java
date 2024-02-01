public class LeetCodeProblem {
    public class ListNode {
            int val;
            ListNode next;
             ListNode() {}
             ListNode(int val) { 
                this.val = val; 
            }
             ListNode(int val, ListNode next) { 
                this.val = val; this.next = next; 
            }
        }
    public static ListNode head;
    public static ListNode tail;
    public static int size=0;

    public void addFirst(int val) {
        ListNode newNode = new ListNode(val,null);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode; 
         
    }
   
   
    public void addLast(int val) {
        ListNode newNode = new ListNode(val,null);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        System.out.println("Slow step-1 =>"+slow.val);
        ListNode fast=head;
        System.out.println("fast step-1 =>"+fast.val);
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public static void main(String[] args) {
        LeetCodeProblem lt=new LeetCodeProblem();
        lt.addFirst(1);
        lt.addLast(2);
        lt.addLast(3);
        lt.addLast(4);
        lt.addLast(5);
        lt.addLast(6);

       // System.out.println(head.val);
        ListNode node= lt.middleNode(head);
        System.out.println(node.val);
        
    }
}
