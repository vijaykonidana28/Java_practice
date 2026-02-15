import java.util.*;
class Addition
{
    int a,b;
    Addition(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    public void showData()
    {
        System.out.println("a+b : "+(a+b));
    }
}
class Constructor
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b values : ");
        a = sc.nextInt();
        b = sc.nextInt();
        Addition add = new Addition(a,b);
        add.showData();
    }
}