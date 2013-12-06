package pistachio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner potato = new Scanner(System.in);

		int quarter, dime, nickel, penny;

		System.out.println("Please Enter the Cost of the Item:");
		double cost = potato.nextDouble();
		System.out.println("Please Enter the Amount Paid:");
		double paid = potato.nextDouble();

		double change = paid - cost;
		change = ((100) * Math.round(change * 100)) / 100;
		
		double change2 = change;
		
		quarter = (int) (change2 / 25);
		change2 = change2 % 25;
		dime = (int) (change2 / 10);
		change2 = change2 % 10;
		nickel = (int) (change2 / 05);
		change2 = change2 % 5;
		penny = (int) change2;

		System.out.println("Change Owed: " + (change / 100) + "\nQuarters: " + quarter
				+ "\nDimes: " + dime + "\nNickels: " + nickel + "\nPennies: "
				+ penny);

	}

}
