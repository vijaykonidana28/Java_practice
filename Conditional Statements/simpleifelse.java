import java.util.*;
class simpleifelse
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        if (n%2==0) System.out.println("It is even bro");
        else System.out.println("It is odd dude");
    }
}