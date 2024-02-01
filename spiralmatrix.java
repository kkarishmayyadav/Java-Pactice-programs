public class spiralmatrix {
  /*  public static void spiralmatrix(int matrix[][]) {
        int StartRow=0,EndRow=matrix.length-1;
        int StartCol=0,EndCol=matrix[0].length-1;
        while(StartRow<=EndRow && StartCol<=EndCol)
        {   //top row
            for(int j=StartCol;j<=EndCol;j++)
                System.out.print(matrix[StartRow][j]+" ");
                //right column
            for(int i=StartRow+1;i<=EndRow;i++)
                System.out.print(matrix[i][EndCol]+" ");
                //bottom row
            for(int j=EndCol-1;j>=StartCol;j--)
                System.out.print(matrix[EndRow][j]+" ");
                //left coloumn
            for(int i=EndRow-1;i>StartRow;i--)
                System.out.print(matrix[i][StartCol]+" ");
                //increment & decreament variables
            StartRow++; StartCol++ ; EndCol--;EndRow--;
        }
    }*/
  /*public static void FindKeyIn2DArray(int matrix1[][], int key) {
           
            int i=0;
            boolean flag=true;
            int j=matrix1[0].length-1;
            while(i<matrix1.length && j>=0)
            {
                if(key==matrix1[i][j])
                    {
                        System.out.println("Index of Key value in array is :"+ "["+i +","+ j+"]"); 
                        flag=false;
                        break;  
                    }
                else if(key>matrix1[i][j])
                    i++;
                else if(key<matrix1[i][j])
                    j--;
            }
            if(flag)
            System.out.println("Key is not found ");

    }
  /  public static void FindKeyIn2DArray1(int matrix1[][], int key) {
           
        int i=matrix1.length;
        boolean flag=true;
        int j=0;
        while(i>=0 && j<matrix1[0].length)
        {
            if(key==matrix1[i][j])
                {
                    System.out.println("Index of Key value in array is :"+ "["+i +","+ j+"]"); 
                    flag=false;
                    break;  
                }
            else if(key>matrix1[i][j])
                j++;
            else if(key<matrix1[i][j])
                i--;
        }
        if(flag)
        System.out.println("Key is not found ");

}*/
    public static int DiagonalSum(int matrix[][]) {
        int sum=0;
        int j=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++)
        {
            sum+=matrix[i][i];
            
            
            if(i!=j-i)
            sum+=matrix[i][j-i];
        }
        return sum;
}
    public static void main(String[] args) {
        int matrix[][]={{1, 2,  3, 4, 6},
                        {8, 9, 10,11,14},
                        {15,16,17,18,20},
                        {22,23,24,25,32},
                        {34,35,40,45,46},
                        };
        System.out.println("Sum of Diagonals is : "+DiagonalSum(matrix));
       
    }
}
