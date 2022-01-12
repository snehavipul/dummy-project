package assignment_1;

import java.util.Scanner;

public class TotalBill {
	public static void main (String[] args) {
		
	System.out.println("Enter the bill amount: ");
	
	Scanner sc = new Scanner(System.in);
	int bill = sc.nextInt();
	sc.close();
	
	if (bill <=300 ) {
		System.out.println("Total amount to pay Rs: "+(bill+50) );
	
	}
	else if (bill > 300 && bill<=500 ){
		System.out.println("Total amount to pay Rs: "+(bill+20) );
			
	}
	else if (bill > 500 && bill<=1000){
		System.out.println("Total amount to pay Rs: "+(bill+10) );
			
	}
	else if (bill > 1000){
		System.out.println("Total amount to pay Rs: "+bill);
			
	}
	

}
}
