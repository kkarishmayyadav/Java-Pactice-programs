public class LengthOfWord {
   
   public static void main(String[] args) {

    String s="j";
    int last=0 , first=0;
    for(int i=s.length() ; i>0 ; i--){
        if(s.charAt(i-1) == ' ' && last == 0){
           continue;
        }else if(s.charAt(i-1) != ' ' && last == 0){
            last=i;
            System.out.println(last);
        }else if(s.charAt(i-1) == ' '  && last !=0 ){
            first = i;
            System.out.println(first);
            break;
        }
    }
    int l=last -first;
    
    System.out.println(l);
   }
}
