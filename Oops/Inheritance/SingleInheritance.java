import java.util.Scanner;

public class Parent {
	int a,b;
	Parent(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public void showData()
	{
		System.out.println("The parent Data :"+(a+b));
	}

}
public class Child extends Parent {
	int c,d;
	Child(int a, int b, int c,int d)
	{
		super(a,b);
		this.c = c;
		this.d = d;
	}
	public void showChild()
	{
		System.out.println("The Parent sum is : "+(a+b));
		System.out.println("The Child sum is : "+(c+d));
	}

}
public class SingleInheritance {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a,b,c,d values : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		Child ch = new Child(a,b,c,d);
		ch.showChild();
        ch.showData();// We can call parent's method with child's object
		sc.close();
		

	}

}
