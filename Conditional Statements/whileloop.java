import java.util.*;
class whileloop
{
    public static void main(String args[])
    {
        int a,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        a = sc.nextInt();
        while(a>0)
        {
            s = s+a;
            a--;
        }
        System.out.println("The sum is : "+s);
    }
}