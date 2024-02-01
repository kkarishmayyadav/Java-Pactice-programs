import java.util.ArrayList;

/**
 * Heap
 */
public class Heap {

   static class MaxHeap{
         ArrayList<Integer> heap=new ArrayList<>();

        public void insert(int value){
            heap.add(value);

            int child_Idx=heap.size()-1;
            int parent_idx=(child_Idx-1)/2;

            while (heap.get(child_Idx)<heap.get(parent_idx)) {
                
                //Swap 
                int temp=heap.get(child_Idx);
                heap.set(child_Idx, heap.get(parent_idx));
                heap.set(parent_idx, temp);

                

                child_Idx=parent_idx;
                parent_idx=(child_Idx-1)/2;
            }
            // int left=2*parent_idx+1;
            //     int right=2*parent_idx+2;

            //     if(left>right){
            //         int temp1=heap.get(left);
            //         heap.set(left, heap.get(right));
            //         heap.set(right, temp1);
            //     }
        }

        public int peak(){
           return heap.get(0);
        }

        public void heapify(int i){

            int left= 2*i+1;
            int right=2*i+2;
            int minidx=i;

            if(left < heap.size()  && heap.get(minidx) > heap.get(left) ){
                minidx=left;
            }
            if(right < heap.size()  && heap.get(minidx) > heap.get(right)){
                minidx=right;
            }

            if(minidx!=i){
                int temp=heap.get(i);
                heap.set(i, heap.get(minidx));
                heap.set(minidx, temp);

                heapify(minidx);
            }
        }

        public int remove(){
            //get data to return;
            int data=heap.get(0);

            //swap 0th index with last index
            int temp=heap.get(0);
            heap.set(0, heap.get(heap.size()-1));
            heap.set(heap.size()-1, temp);

            //remove element
            heap.remove(heap.size()-1);

            //heapify 
            heapify(0);

            return data;

        }

        public boolean isEmpty(){
            return heap.size()==0;
        }
    }

    public static void main(String[] args) {
        
        MaxHeap mh= new MaxHeap();
        mh.insert(2);
        mh.insert(4);
        mh.insert(1);
        mh.insert(6);
        mh.insert(3);
        mh.insert(9);
        mh.insert(7);
        mh.insert(8);

        //mh.peak();
        while (!mh.isEmpty()) {
            
            System.out.println(mh.remove());
        }
    }
}