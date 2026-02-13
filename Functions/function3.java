//  Arguments passed and Returns a value.
import java.util.*;
class function3
{
    // here l,b in fun(l,b) are parameters or Arguments.
    public static float fun(float l,float b)
    {
        float p;
        p = 2*(l+b);
        return(p);// Return the value
        
    }
    public static void main(String args[])
    {
        float l,b;
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth : ");
        l = sc.nextFloat();
        b = sc.nextFloat();
        x=fun(l,b); // Function declaration.
        System.out.println("The perimeter of Rectangle is : "+x);
    }
}