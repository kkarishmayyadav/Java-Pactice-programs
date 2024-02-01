public class sqrtWithoutUsingBuiltInFunction {
    class Solution {
        public int mySqrt(int x) {
            int i=1;
             double low=0, high=0 , mid=0;
            while(i*i<=x){
                if(i*i < x)
                    i++;
                if(i*i == x){
                    return i;
                }
            }
            low=i-1;
            high=i;
            mid= (low+high) /2;

            while(mid < x/2){
    
                if(mid*mid < x ){
                    low=mid;
                    mid=(low+high) /2;
                }
                else if( mid*mid > x ){
                    high = mid;
                    mid= (low+high) /2;
                }
            }
            return (int)mid;
        }
    }

    public static void main(String[] args) {
        
        sqrtWithoutUsingBuiltInFunction sqrt=new sqrtWithoutUsingBuiltInFunction();
        Solution inner=sqrt.new Solution();
       int n= inner.mySqrt(9);
       System.out.println(n);
    }
}
