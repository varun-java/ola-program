package generalisation;

import java.util.Scanner;

public class OlaBooking {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean b=true;
		
		while(b) {
		System.out.println("1.Prime");
		System.out.println("2.Sedan");
		System.out.println("3.Auto");
		System.out.println("4.Exit");
		System.out.println("Which one you want to book");
		Ola p = null;
		int choice = s.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter the distance");
			p = new Prime(s.nextInt());
			break;
		}
		case 2: {
			System.out.println("Enter the distance");
			p = new Sedan(s.nextInt());
			break;
		}
		case 3: {
			System.out.println("Enter the distance");
			p = new Prime(s.nextInt());
			break;
		}
		case 4: {
			b=false;
			break;
		}
		default:
		{
			System.out.println("invalid choice");
		}
		}
		if(p instanceof Prime)
		((Prime)p).displayTotalCost();
		else if(p instanceof Sedan)
			((Sedan)p).displayTotalCost();
		else if(p instanceof Auto)
			((Auto)p).displayTotalCost();
	}
	}
}
