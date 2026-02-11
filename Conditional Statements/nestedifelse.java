import java.util.*;
class nestedifelse
{
    public static void main(String args[])
    {
        int age,wg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age and Weight of the person : ");
        age = sc.nextInt();
        wg = sc.nextInt();
        if (age>18)
        {
            if (wg>45)
            {
                System.out.println("You can donate blood!");
            }
            else
            {
                System.out.println("Your weight is not sufficient.. So you can't");
            }
        }
        else
        {
            System.out.println("You are not at that age.. So you can't");
        }
    }
}