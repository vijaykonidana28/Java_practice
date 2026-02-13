import java.util.*;
class dowhile
{
    public static void main(String args[])
    {
        int a,s=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        a = sc.nextInt();
        do
        {
            s=s*a;
            a--;
        }while(a>0);
        System.out.println("The product is : "+s);
    }
}