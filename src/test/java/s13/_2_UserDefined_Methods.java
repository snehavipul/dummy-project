package s13;

public class _2_UserDefined_Methods {

			
		// 1. No input no return method -  
		// it doesn't take any input and doesn't return anything
		public void test()
		{
			System.out.println("test method");
		}

		// 2. No input some return function - 
		// this function doesn't take any input but return something
		// Example 1
		public String nameOfCountry()
		{
			String countryName = "India";
			return countryName;
		}
		// Example 2
		public String[] listOfStudents()
		{
			System.out.println("Student List - ");
			String names[] = new String[3];
			names[0] = "Tom";
			names[1] = "Harry";
			names[2] = "John";
			return names;
		}
		
		// 3. Some input with some return 
		// Example 1
		public int add(int a, int b)
		{	
			int c = a+b;
			return c;
		}
		// Example 2
		public String factoryName(String NameOfFactory)
		{
			if (NameOfFactory.equals("nike")) {
				String fact1 = "nike";
				System.out.println("This is nike factory");
				return fact1;
			}

			else if (NameOfFactory.equals("puma")) {
				String fact2 = "puma";
				System.out.println("This is puma factory");
				return fact2;
			}
			return "no factory within the criteria found";
		}

		// Example 3
		public String countryCapital(String NameOfCountry) {
			if (NameOfCountry.equals("india")) {
				return "New Delhi";
			}

			if (NameOfCountry.equals("usa")) {
				return "Washington DC";
			} else {
				return "no country found";
			}
		}
	
	}

