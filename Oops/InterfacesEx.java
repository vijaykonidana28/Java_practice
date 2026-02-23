interface Animal {
	int legs = 4;
	void eat();
	void livesin();

}
public class Elephant implements Animal{
	int legs=6;
	public void eat()
	{
		System.out.println("The elephant is vegetarian ");
	}
	public void livesin()
	{
		System.out.println("It has "+legs+" legs!");
		System.out.println("It lives on the land !");
	}
	
}
public class Whale implements Animal{
	int legs=0;
	public void eat()
	{
		System.out.println("The Whale is non-vegetarian");
	}
	public void livesin()
	{
		System.out.println("It has "+legs+" legs!");
		System.out.println("It lives in the water!");
	}

}
public class InterfacesEx {

	public static void main(String[] args) {
		Animal animal=new Elephant();
		animal.eat();
		animal.livesin();
		Animal an = new Whale();
		an.eat();
		an.livesin();

	}

}