import java.util.Scanner;

public class Parent {
	int a,b;
	Parent(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public void showParent()
	{
		System.out.println("The parent data is : "+(a+b));
	}

}
public class Peeku extends Parent{
	int pa , pb;
	Peeku(int a, int b,int c,int d)
	{
		super(a,b);
		this.pa=c;
		this.pb=d;
	}
	public void showPeeku()
	{
		System.out.println("The peeku's father data is : "+(a+b));
		System.out.println("The peeku's data is : "+(pa+pb));
	}

}

public class Peekubhai extends Parent {
	int ba , bb;
	Peekubhai(int a, int b,int c,int d)
	{
		super(a,b);
		this.ba=c;
		this.bb=d;
	}
	public void showPeekubhai()
	{
		System.out.println("The peeku bhai's father data is : "+(a+b));
		System.out.println("The peeku bhai's data is : "+(ba+bb));
	}


}

public class Hirarchial {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,c,d values : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		Peeku pk = new Peeku(a,b,c,d);
		pk.showPeeku();
		Peekubhai p = new Peekubhai(d,c,a,b);
		p.showPeekubhai();
		sc.close();

	}

}