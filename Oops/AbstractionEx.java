//Abstract classes are used when I want to share common logic, block direct object creation
// and force subclasses to complete required behavior.
// They are not mandatory for small code, but essential for scalable, maintainable systems.
abstract class MotorBike {
	int cc;
	float weight;
	public abstract void stats();

}
class Bmw extends MotorBike {
	Bmw(){
		cc = 750;
		weight = 545.13f;
	}
	
	public void stats()
	{
		System.out.println("This is the BMW ! ");
		System.out.println("Its Engine cc is : "+cc);
		System.out.println("Its Weight is : "+weight);
	}


}

public class Triumph extends MotorBike{
	Triumph(){
		cc = 400;
		weight = 513.45f;
	}
	
	public void stats()
	{
		System.out.println("This is the Triumph Bike ");
		System.out.println("Its Engine cc is : "+cc);
		System.out.println("Its Weight is : "+weight);
	}

}

public class AbstractionEx {

	public static void main(String[] args) {
		MotorBike triumph = new Triumph();
		triumph.stats();
		Bmw bmw = new Bmw();
		bmw.stats();

	}

}
