public class queueusingArray {
    

    //Creating queue using array
    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear = -1;
        }

        //Check queue is empty 

        public boolean isEmpty() {
            return rear == -1;     
       }

       //add in queue

       public  void add(int data) {
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }

            rear+=1;
            arr[rear]=data;
       }

       //remove data from queue

       public int remove() {
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            int front=arr[0];
            for(int i=0;i<=rear;i++){
                arr[i]=arr[i+1];
           }
           rear-=1;
            return front;
       }

       //display the last value of queue

       public int peek() {
        if(rear== -1){
            System.out.println("Empty Queue");
            return -1;
        }
            return arr[0];
       }

       public  void print() {
            for(int i=0;i<=rear;i++){
                System.out.println(arr[i]);
            }
       }

       
    }
    




    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.print();
        q.remove();
        System.out.println();
        q.print();
    }
}
