package s6;

public class StingManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello Everyone";
		
		System.out.println("length of string str1:"+ str1.length());
		System.out.println("char at 2nd position:"+ str1.charAt(13));
		System.out.print("potion of char O is "+ str1.indexOf('o'));
		System.out.println();
	    System.out.println(str1.indexOf('e', 2));
	    System.out.println(str1.indexOf('e', str1.indexOf('e')+1));
	    
	    
	    String str2="banana Banana";
	    System.out.println("length of string str2:"+ str2.length());
		System.out.println("char at 2nd position:"+ str2.charAt(10));
		System.out.println("potion of char a is "+ str2.indexOf('a'));
		System.out.println(str2.indexOf('a', 2));
	    System.out.println(str2.indexOf('n', str2.indexOf('n')+1));
	    
	    
	    // To find specific word in string
	    
	    String str3="      hey hai how are you";
	    System.out.println(str3.indexOf("how"));
	    System.out.println(str3.indexOf("hello"));		// string is not present -1
	    	      
	    
	    System.out.println("after uppercase conversion:"+str3.toUpperCase());	
	    System.out.println("after uppercase conversion:"+str3.toLowerCase());
	    
	    System.out.println("after remove white space:"+str3.trim());		//remove white spaces
	    
	    System.out.println("replace specific char by another char"+str3.replace('h', 'H'));
	    
	    System.out.println("Is web word is available in given string: "+str3.contains("web"));//result wil b in boolean true or false
	    System.out.println("Is web word is available in given string: "+str3.contains("hey"));
	    
	    
	    
	}

}
