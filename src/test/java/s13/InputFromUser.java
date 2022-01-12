package s13;
import java.util.Scanner;

public class InputFromUser {
	
			public static void main(String[] args) {

			System.out.println("Please enter the two numbers for total");

			Scanner sc = new Scanner(System.in);
			int intOne = sc.nextInt();
			int intTwo = sc.nextInt();
			sc.close();

			_2_UserDefined_Methods userMethods = new _2_UserDefined_Methods();
			int totalOfNumbers = userMethods.add(intOne, intTwo);
			System.out.println("The total for two numbers " + intOne + " & " + intTwo + " is -> ");
			System.out.println(totalOfNumbers);
		}

	}


