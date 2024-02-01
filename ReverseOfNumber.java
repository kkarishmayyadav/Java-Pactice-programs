import java.util.*;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to Reverse : ");
        int a=s.nextInt(); 
        int num=0;
        while(a!=0)
        {
            num= num * 10 + a%10;
            a=a/10;
        }
        System.out.println("Reverse number is  :  "+num);
    }
}
