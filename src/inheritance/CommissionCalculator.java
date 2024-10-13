package inheritance;

import java.util.Scanner;

public class CommissionCalculator {
	private Auto auto = new Auto("", "", "", "", 0.0, 0.0);
	private Home home = new Home("", "", 0.0, 0.0, 0.0, 0.0);
	private Life life = new Life("", "", 0, 0);
	
	public void Run() {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("-----------------------------\n"
					+ "\n"
					+ "Welcome to Parkland Insurance\n"
					+ "\n"
					+ "-----------------------------\n"
					+ "\n"
					+ "Enter any of the following:\n"
					+ "\n"
					+ "       1) Enter auto insurance policy information\n"
					+ "\n"
					+ "       2) Enter home insurance policy information\n"
					+ "\n"
					+ "       3) Enter life insurance policy information\n"
					+ "\n"
					+ "       4) Compute commission and print auto policy\n"
					+ "\n"
					+ "       5) Compute commission and print home policy\n"
					+ "\n"
					+ "       6) Compute commission and print life policy\n"
					+ "\n"
					+ "       7) Quit"
					+ "\n\n");
			String selection = input.next();
			
			switch (selection) {
			case "1":
				auto.fromInput();
				break;
			case "2":
				home.fromInput();
				break;
			case "3":
				life.fromInput();
				break;
			case "4":
				auto.computeCommission();
				System.out.println(auto);
				break;
			case "5":
				home.computeCommission();
				System.out.println(home);
				break;
			case "6":
				life.computeCommission();
				System.out.println(life);
				break;
			case "7":
				return;
			default:
				break;
			}
		}
	}
}
