import java.util.ArrayList;

import javax.xml.crypto.Data;

public class QueueUsingArraylist {

    static ArrayList<Integer> list=new ArrayList<>();
    static int rear;

    public boolean isEmpty() {
        return list.size()==0;
    }

    public void add(int data) {
        if(isEmpty()){
            list.add(0, data);
            rear=0;
            return;
        }

        list.add(data);
        rear++;
    }

    public int remove() {
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        
        int front = list.get(0);
        for(int i=0;i<rear;i++){
            list.add(i, list.get(i+1));
            System.out.print(list.get(i)+"->");
        }
        rear-=1;
        return front;
    }


    public int peek() {
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }

        return list.get(0);
    }

    public void print() {
        if(isEmpty()){
            System.out.println("Empty queue");
            return;
        }
        for(int i=0;i<=rear;i++){
            System.out.println(list.get(i));
        }
    }


    public static void main(String[] args) {
        QueueUsingArraylist al=new QueueUsingArraylist();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.print();
        System.out.println("peek ->"+al.peek());
        System.out.println("removed ->"+al.remove());
        al.print();
    }
}
