public class nonrepeatstring {
    public static void main(String[] args) {
        String str="aaabccddd";
        for(int i=0; i<str.length()-1;i++){
           // System.out.print(" "+i+" ");
            if(str.charAt(i)==str.charAt(i+1)){
                // System.out.print(str.charAt(i));
                // System.out.print(str.charAt(i+1));
                // System.out.print(" ");
                if(i==0){
                    str= str.substring(i+2);
                    // System.out.print(str);
                    // System.out.print(" ");
                    i=-1;
                }
                else{
                    // System.out.print(str.substring(0,i));
                    // System.out.print(" ");
                    // System.out.print(str.substring(i+2));
                    str=str.substring(0,i) + str.substring(i+2);
                    // System.out.print(" ");
                    // System.out.print(str);

                    i=-1;
                }
                //System.out.print(" "+i);
            }
        }
        System.out.print(str);
    }
}
