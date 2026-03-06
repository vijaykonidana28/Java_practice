import java.util.*;
public class Listcopy
{
    public static void main(String[] args)
    {
        String s;
        List<String> l = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            s=sc.next();
            l.add(s);
        }
        System.out.println(l);
        // Copying the list
        List<String> x = new ArrayList<String>(l);
        // Copying the list 
        //  Collections.copy(l,x);
        System.out.println("After copying the list : ");
        System.out.println(x);
        // List<String> c = new ArrayList<String>();
        // Collections.copy(c,l);
        // System.out.println("After copying third list : ");
        // System.out.println(c);
    }
}