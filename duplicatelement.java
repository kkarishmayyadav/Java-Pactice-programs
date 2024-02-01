/**
 * duplicatelement
 */
public class duplicatelement {

public static boolean duplicate(int arr[])

{
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
                return false;
        }
    }
    return true;
}
public static int target(int arr[] ,int target) {
    int a=target;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==a)
            return i;
    }
    return -1;
}

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1};
        int target =5;
       
        System.out.println("index value of target is =  "+ target(arr,target)); 
        
}
}