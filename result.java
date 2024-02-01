

import java.util.*;

class Result {


    public static int sockMerchant(int n, List<Integer> ar) {

        Set<Integer> socksSet = new HashSet<Integer>();
        int pair=0;
        for(int i=0 ; i<n ; i++){
            if(socksSet.contains(ar.get(i))){
                pair++;
                ar.remove(ar.get(i));
            }
            else{
                socksSet.add(ar.get(i));
            }
        }
        return pair;
    }

}

 class Solution {
    public static void main(String[] args) {
        int n=7;
      List<Integer> ar=new ArrayList<Integer>(n);
      //Result rs=new Result();
      ar.add(10);
      ar.add(20);
      ar.add(20);
      ar.add(10);
      ar.add(10);
      ar.add(30);
     ar.add(50);

      System.out.println(Result.sockMerchant(n,ar)); 
    }
}
