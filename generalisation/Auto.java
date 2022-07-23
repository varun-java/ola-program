package generalisation;

public class Auto extends Ola{
	{
		price=15;
	}

	public Auto(int distance) {
		super(distance);
	}
	public void displayTotalCost()
	{
		System.out.println("Total Cost:"+distance*price);
	}
}
