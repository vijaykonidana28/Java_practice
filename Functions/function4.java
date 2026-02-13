// Arguments passed but No Return value.
import java.util.*;
class function1
{
    public static void fun(float l, float b)
    {
        System.out.println("The perimeter of Rectangle is : "+ 2*(l+b));
    }
    public static void main(String args[])
    {
        float l,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth : ");
        l = sc.nextFloat();
        b = sc.nextFloat();
        fun(l,b);
    }
}