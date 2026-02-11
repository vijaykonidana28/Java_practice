import java.util.*;
class simpleradius
{
    public static void main(String args[])

    {
        float r,PI=3.14f;// we should end the declaration of float values with f.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius in float : ");
        r = sc.nextFloat();
        System.out.println("The area of the cirlce is : "+(r*r*PI));
    }
}