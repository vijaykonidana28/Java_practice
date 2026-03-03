import java.util.*;
public class StringToken
{
    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}