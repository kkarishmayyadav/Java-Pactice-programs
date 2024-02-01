import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExamples {
    public static Boolean CheckArrayListOrder(ArrayList<Integer>list) {
       
        if(list.get(0)<list.get(1))
            {
                for(int i=1;i<list.size()-1;i++)
                {
                    if(list.get(i)>list.get(i+1))
                        {
                            System.out.println("ArrayList is not on Increasing/Decreasing order");
                            return false;
                        }
                }
                System.out.println("ArrayList is in Increasing order");
                return true;
            }
        else if(list.get(0)>list.get(1))
        {
            for(int i=1;i<list.size()-1;i++)
            {
                if(list.get(i)<list.get(i+1))
                {
                    System.out.println("ArrayList is not on Increasing/Decreasing order");
                    return false;
                }
            }
            System.out.println("ArrayList is in Decreasing order");
            return true;
        }
        return null;
    }
    

    public static ArrayList<Integer> LonelyNumber(ArrayList<Integer> list) {
        ArrayList<Integer> Ans_list=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            
            for(int j=0;j<list.size();j++)
                if(list.get(j)!=list.get(i))
                {
                    {
                        if(list.get(j)!=list.get(i)+1 || list.get(j)!=list.get(i)-1)
                            Ans_list.add(list.get(i));
                    }
                    
                }
            
        }
        return Ans_list;
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //System.out.println("Enter Element in ArrayList : ");
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
       /* for(int i=0;i<5;i++)
        {
            Scanner s=new Scanner(System.in);
            list.add(s.nextInt());
        }*/
        
        System.out.println(LonelyNumber(list));
    }
}
