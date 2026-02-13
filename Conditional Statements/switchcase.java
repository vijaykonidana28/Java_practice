import java.util.*;
class switchcase
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.multiplicaton");
        System.out.println("4.division");
        System.out.println("5.modulus");
        System.out.println("6.Exit");
        System.out.println("Enter your choice : ");
        c = sc.nextInt();
        switch(c)
        {
            case 1: 
                System.out.println("The result is : "+(a+b));
                break;
            case 2:
                System.out.println("The result is : "+(a-b));
                break;
            case 3:
                System.out.println("The result is : "+(a*b));
                break;
            case 4:
                System.out.println("The result is : "+(a/b));
                break;
            case 5:
                System.out.println("The result is : "+(a%b));
                break;
            case 6:
                break;
            default:
                System.out.println("Choose from the list!!");
                break;
        }
    }
}