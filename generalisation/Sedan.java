package generalisation;

public class Sedan extends Ola {
	{
		price=22;
	}
	public Sedan(int distance) {
		super(distance);
	}
	public void displayTotalCost()
	{
		System.out.println("Total Cost:"+distance*price);
	}
}
