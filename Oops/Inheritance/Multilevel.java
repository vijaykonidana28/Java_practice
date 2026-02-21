import java.util.Scanner;

public class Grand {
	int a,b;
	Grand(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public void showGrand()
	{
		System.out.println("The Grand data is : "+(a+b));
	}

}
public class Parent extends Grand {
	int c,d;
	Parent(int a, int b, int c, int d)
	{
		super(a,b);
		this.c = c;
		this.d = d;
	}
	public void showParent()
	{
		System.out.println("The Grand parent data is : "+(a+b));
		System.out.println("The parent data is : "+(c+d));
	}

}
public class Child extends Parent{
	int e,f;
	Child(int a, int b, int c, int d, int e,int f)
	{
		super(a,b,c,d);
		this.e = e;
		this.f = f;
	}
	public void showChild()
	{
		System.out.println("The Grand parent data here is : "+(a+b));
		System.out.println("The Parent data here is : "+(c+d));
		System.out.println("The Child data here is : "+(e+f));
		
	}

}
public class Multilevel{

	public static void main(String[] args) {
		int a,b,c,d,e,f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the a,b,c,d,e,f values : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		Child ch = new Child(a,b,c,d,e,f);
		ch.showChild();
		sc.close();

	}

}
