import java.util.Scanner;

public class print_number{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the last number : ");
        int num=s.nextInt();
        int count=1; 
        while(num>=count)
        {
            System.out.println(count);
            count++;
        }
    }
}
