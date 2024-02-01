import java.util.*;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the natural number : ");
        int a=s.nextInt();
        int sum=0;
        while(a!=0)
        {
            sum=sum+a;
            a--;
        }
        System.out.println(sum);
    }
}
