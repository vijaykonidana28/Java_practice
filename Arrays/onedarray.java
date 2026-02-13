// Simmple 1-Dimensioanl array
import java.util.*;
class onedarray
{
    public static void main(String args[])
    {
        int[] a;
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size the array : ");
        s = sc.nextInt();
        a = new int[s]; // initialization
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<s;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The Array elements are : ");
        for(int i=0; i<s;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}