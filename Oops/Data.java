package oops;

import java.util.Scanner;
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

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Teacher ID : ");
		id = sc.nextInt();
		System.out.print("Enter Teacher name : ");
		name = sc.next();
		Teacher t = new Teacher();
		t.getDetails(id, name);
		t.showDetails();
		sc.close();
		
	}

}
