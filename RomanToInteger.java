import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {

        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total=map.get(s.charAt(0));
        System.out.println(total);

        for(int i=1; i<s.length();i++){

            if(map.get(s.charAt(i)) <= map.get(s.charAt(i-1))){

                total=total+map.get(s.charAt(i));
                        System.out.println(total);

                
            }
            if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                int m=map.get(s.charAt(i));
                System.out.println(m);
                int n=map.get(s.charAt(i-1));
                System.out.println(n);
                

                total=total + (m-2*n);
                        System.out.println(total);

                
            }
        }
        return total;
        
    }

public static void main(String[] args) {
    RomanToInteger rt=new RomanToInteger();
    System.out.println(rt.romanToInt("XXIX")); 


}
    
}