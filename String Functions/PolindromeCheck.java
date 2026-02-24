import java.util.Scanner;

public class PolindromeCheck {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word : ");
		s=sc.next();
		s=s.toLowerCase();
		String rev1 = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev1 = rev1 + s.charAt(i);
		}
		if (s.equals(rev1)) {
			System.out.println("This is polindrome");
		}
		else
		{
			System.out.println("This is not polindrome");
		}
	}
}