// No Arguments passed and No Return value.
import java.util.*;
class function1
{
    public static void fun()// function declaration with fun() as name.
    {
        float l,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth : ");
        l = sc.nextFloat();
        b = sc.nextFloat();
        System.out.println("The perimeter of Rectangle is : "+ 2*(l+b));
    }
    public static void main(String args[])
    {
        fun();
        fun();
    }
}