// Simple 2-Dimensional Array 
import java.util.*;
class twodarray
{
    public static void main(String args[])
    {
        int[][] a;
        int r,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and column for the array : ");
        r = sc.nextInt();
        c = sc.nextInt();
        a = new int[r][c];// Intialization of array
        System.out.println("Enter the elements for array : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}