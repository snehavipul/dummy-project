package assignment_3;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OperationLogic refvar= new OperationLogic();
		
		System.out.println("Enter the number : ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//sc.close();
		
		Scanner sc1 = new Scanner(System.in);
		
					
		switch (number) {
					
		case 1 :
			System.out.println("Its Addition operation ");
			System.out.println("Enter the two numbers ");
			int num1 = sc1.nextInt();
			int num2 = sc1.nextInt();
			sc1.close();
			
			int add= refvar.addition(num1, num2);
			System.out.println("Result is: " +add);
			break;
			
		case 2:
			System.out.println("Its substraction operation ");
			System.out.println("Enter the two numbers ");
			int num3 = sc1.nextInt();
			int num4 = sc1.nextInt();
			sc1.close();
			
			int sub= refvar.substraction(num3, num4);
			System.out.println("Result is: " +sub);
			break;
			
		case 3:
			System.out.println("Its multiplication operation ");
			System.out.println("Enter the two numbers ");
			int num5 = sc1.nextInt();
			int num6 = sc1.nextInt();
			sc1.close();
			
			int mul= refvar.multiplication(num5,num6);
			System.out.println("Result is: " +mul);
			break;
			
		case 4:
			System.out.println("Its Division operation ");
			System.out.println("Enter the two numbers ");
			int num7 = sc1.nextInt();
			int num8 = sc1.nextInt();
			sc1.close();
			
			int div= refvar.division(num7, num8);
			System.out.println("Result is: " +div);
			break;
		
		
		default:
			System.out.println("Enter a number between 0 to 4 ");
			break;
		}

	}


	}


