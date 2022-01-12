package assignment_4;
import java.util.Scanner;
public class ReverseString {
	
	
	public String reverse_string(String str){
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		return str;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string: ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		ReverseString rstr=new ReverseString();
		
		rstr.reverse_string(str);
		
	}

}
