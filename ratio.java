import java.util.ArrayList;
import java.util.List;

public class ratio {
    public static void main(String[] args) {
        
    //     List<Integer> arr=new ArrayList<>();
    //     arr.add(0, -4);
    //     arr.add(1, 3);
    //     arr.add(2, -9);
    //     arr.add(3, -0);
    //     arr.add(4, 4);
    //     arr.add(5, 1);

    //     int[] num={0,0,0};
        
    //     for(int i=0; i<arr.size() ; i++){
    //         if(arr.get(i) > 0){
    //             num[0] = num[0]+1;
    //             System.out.print(num[0]+" ");
    //         }
                
    //         else if(arr.get(i) < 0){
    //             num[1]=num[1]+1;
    //             System.out.print(num[1]+" ");
    //         }
                
    //         else{
    //             num[2]=num[2]+1;
    //             System.out.print(num[2]+" ");
    //         }
                
    //     }
        
    //     System.out.println(Double.valueOf(num[0])/Double.valueOf(arr.size()));
    //     System.out.println(num[1]/arr.size());
    //     System.out.println(num[2]/arr.size());
    // }

    List<Integer> s=new ArrayList<>();
    s.add(0, 1);
    s.add(1, 2);
    s.add(2, 1);
    s.add(3, 3);
    s.add(4, 2);

        int count=0;
        //1 2 1 3 2
        int d=3;
        int  m=2;
        for(int i=0; i<s.size()-m; i++){
            int sum=0;
            for(int j=i ; j<(i+m) ; j++){
                sum= sum+s.get(j);
            }
            if(sum == d)
                count++;
        }
        System.out.println(count);
    }

}
