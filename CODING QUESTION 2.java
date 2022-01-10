package labTest1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double sales;
		int hours;
		double commission = 0;
		double dailyWages;
		double totalWages;
		
		System.out.print("Enter sales        : RM");
		sales = input.nextDouble();
		System.out.print("Enter hours worked : ");
		hours = input.nextInt();
		
		if (sales >= 150 && sales <= 300)
			commission = sales * 0.05;
		else if (sales >= 301 && sales <= 500)
			commission = sales * 0.1;
		else if (sales > 500)
			commission = sales * 0.15;
		
		dailyWages = hours * 5.0;
		totalWages = dailyWages + commission;
		
		System.out.println();
		System.out.printf("Commission         : RM%.2f" , commission);
		System.out.printf("\nDaily wages        : RM%.2f" , totalwages);

	}

}
