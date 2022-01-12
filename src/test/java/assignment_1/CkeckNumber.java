package assignment_1;

import java.util.Scanner;


public class CkeckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number to check: ");
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if(num> 300) {
			System.out.println(num+ " is greater than 300");
		}
		else if(num<300){
			System.out.println(num+ " is smaller than 300");
			
		} else
		{
			System.out.println(num+ " is equals to 300 ");
		}
		

	}

}
