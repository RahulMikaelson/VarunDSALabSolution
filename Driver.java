package GreatLearning_Lab3_Question1;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		BalanceCheck bc = new BalanceCheck();
		System.out.println("Enter the Input Bracket");
		String expr = sc.next();
		check = bc.balanceChecking(expr);
		if (check == false)
			System.out.println("Given Input is not balanced");
		else
			System.out.println("Given Input is balanced");
		sc.close();

	}
}
