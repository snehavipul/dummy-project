package assignment_2;
import java.util.Scanner;
public class DayNoOfWeek {
	
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			System.out.println("Enter the number to check day: ");
			
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			sc.close();
			
			//int number = 2;
			
			switch (number) {
			case 1 :
				System.out.println("Its Monday");
				break;
			case 2:
				System.out.println("Its Tuesday");
				break;
			case 3:
				System.out.println("Its Wednsday");
				break;
			case 4:
				System.out.println("Its Thrusday ");
				break;
			case 5:
				System.out.println("Its Friday");
				break;
			case 6:
				System.out.println("Its Saturday");
				break;
			case 7:
				System.out.println("Its Sunday");
				break;
			
			default:
				System.out.println("Enter a number between Zero to seven ");
				break;
			}

		}


}
