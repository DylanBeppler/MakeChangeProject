package makechange;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int twentyd = 2000;
		int tend = 1000;
		int fived = 500;
		int oned = 100;

		double quarter = 25;
		double dime = 10;
		double nickel = 5;
		double penny = 1;

		System.out.println("What is the cost of the item being purchased? ");
		double cost = sc.nextDouble() * 100;
		System.out.println("How much money was received? ");
		double received = sc.nextDouble() * 100;
		double change = received - cost;

		if (received == cost) {
			System.out.println("You have received the correct amount of money.");
		} else if (received < cost) {
			System.out.println("You have received too little money.");
		} else {
			change = Math.round(change * 100.0) / 100.0;
			System.out.println("The customer's change is " + change / 100);
			System.out.print("The customer will receive: ");

			int numTwenties = (int) (change / twentyd);
			change %= twentyd;

			int numTens = (int) (change / tend);
			change %= tend;

			int numFives = (int) (change / fived);
			change %= fived;

			int numOnes = (int) (change / oned);
			change %= oned;

			int numQuarters = (int) (change / quarter);
			change %= quarter;

			int numDimes = (int) (change / dime);
			change %= dime;

			int numNickels = (int) (change / nickel);
			change %= nickel;

			int numPennies = (int) (change / penny);
			change = (int) ((change % penny) * 100) / 100.0;

			if (numTwenties > 0) {
				System.out.print(numTwenties + " twenty dollar bills. ");
			}

			if (numTens > 0) {
				System.out.print(numTens + " ten dollar bills. ");
			}

			if (numFives > 0) {
				System.out.print(numFives + " five dollar bills. ");
			}

			if (numOnes > 0) {
				System.out.print(numOnes + " one dollar bills. ");
			}

			if (numQuarters > 0) {
				System.out.print(numQuarters + " quarters. ");
			}

			if (numDimes > 0) {
				System.out.print(numDimes + " dimes. ");
			}

			if (numNickels > 0) {
				System.out.print(numNickels + " nickels. ");
			}

			if (numPennies > 0) {
				System.out.print(numPennies + " pennies. ");
			}
		}

		sc.close();

	}
}
// mod operator super usefull, looping not good for this //can be done entirely
// in main method //leave out 0's //division operator important


