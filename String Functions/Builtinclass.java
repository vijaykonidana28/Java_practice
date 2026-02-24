import java.util.Scanner;

public class Builtinclass {

	public static void main(String[] args) {
		int p;
		Scanner sc = new Scanner(System.in);
		String s = "These are Builtin Functions";
		System.out.println("Enter the position to check : ");
		p = sc.nextInt();
		System.out.println(s.charAt(p));
		System.out.println(s.compareTo("These are Builtin Functions"));
		System.out.println(s.compareToIgnoreCase("these aRe builtin FUNCTIONS"));
		System.out.println(s.concat(" Really dude"));
		System.out.println("Hey dude ".concat(s));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.endsWith("dude"));
		System.out.println(s.startsWith("These"));
		System.out.println(s.contains("Functions"));
		sc.close();
	}

}