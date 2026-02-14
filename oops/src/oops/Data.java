package oops;

import java.util.Scanner;

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
