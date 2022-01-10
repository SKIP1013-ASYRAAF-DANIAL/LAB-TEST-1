package labTest1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int items;
		int qty1, qty2, qty3;
		double price1, price2, price3;
		double totalItem1, totalItem2, totalItem3;
		double totalItems;
		double finalTotal;
		double discount;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of items: ");
		items = scan.nextInt();
	
	    System.out.print("Enter price of first item: RM ");
	    price1 = scan.nextDouble();
	    System.out.print("Enter quantity of first item: ");
		qty1 = scan.nextInt();
		System.out.println();
		
		System.out.print("Enter price of second item: RM ");
	    price2 = scan.nextDouble();
	    System.out.print("Enter quantity of second item: ");
		qty2 = scan.nextInt();
		System.out.println();
		
		System.out.print("Enter price of third item: RM ");
	    price3 = scan.nextDouble();
	    System.out.print("Enter quantity of third item: ");
		qty3 = scan.nextInt();
		System.out.println();
		
		totalItem1 = price1 * qty1;
		totalItem2 = price2 * qty2;
		totalItem3 = price3 * qty3;
		
		totalItems = totalItem1 + totalItem2 + totalItem3;
		
		if (totalItems > 100)
		{	
			discount = 0.2 * totalItems;
		}    
	    else
	    {	
	    	discount = 0.1 * totalItems;
	    }
		
			finalTotal = totalItems - discount;
			
		System.out.printf("\nTotal price       : RM %.2f" , totalItems);
	    System.out.printf("\nDiscount received : RM %.2f" , discount);
	    System.out.printf("\nPrice to be paid  : RM %.2f" , finalTotal);
	}

}
