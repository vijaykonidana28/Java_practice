package oops;

public class Teacher {
	public int id;
	public String name;
	public void getDetails(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public void showDetails()
	{
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
	}

}
