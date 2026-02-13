// No Arguments passed but Returns value.
import java.util.*;
class function2
{
    // void is avoided with the return type of the function.
    // Here float is the return type.
    public static float fun()// function defined with fun() as name.
    {
        float l,b,p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth : ");
        l = sc.nextFloat();
        b = sc.nextFloat();
        p = 2*(l+b);
        return(p);// Return the value
        
    }
    public static void main(String args[])
    {
        float x;
        x=fun(); // Function declaration.
        System.out.println("The perimeter of Rectangle is : "+x);
    }
}