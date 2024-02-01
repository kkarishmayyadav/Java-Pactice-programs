import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three numbers :  ");
        float a=s.nextFloat();
        float b=s.nextFloat();
        float c=s.nextFloat();
        double avg= a+b+c/3;
        System.out.println(avg);
    }


}