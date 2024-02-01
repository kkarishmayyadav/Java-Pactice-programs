import java.util.Scanner;

public class GstCost {
    public static void main(String[] args) {
        System.out.println("Enter the Cost of 3 Items : ");
        Scanner s = new Scanner(System.in);
        float pen=s.nextFloat();
        float pencil=s.nextFloat();
        float eraser=s.nextFloat();
        // GST Calculation
        float p = (pen + (pen*18/100));
        float pncl= (pencil + (pencil*18/100));
        float er= (eraser + (eraser*18/100));
        float total_Cost= (p+pncl+er);
        System.out.println(p);
        System.out.println(pncl);
        System.out.println(er);
        System.out.println("Total Cost of Items : "+total_Cost);
    }
}
