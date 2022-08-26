package java_data_types;

public class Day24_MoreStrings {

	public static void main(String[] args) {

		String fname = "Ryan";
		String lname = "Sohail";
		String fullname = fname.concat(lname);
		
		System.out.println(fullname);
		
		String day = " Today we are learning to use Strings "; 
		day = day.trim();
		
		if(day.equals("Today we are learning Strings")) {
			System.out.println("Yayy the String method");
		} else { 
			System.out.println("The value does not match");
		}
		
		String transaction = "$50.00";
		boolean dollarSymbol = transaction.startsWith("$");
		if(dollarSymbol) { 
			System.out.println("The prefix is present");
		}else {
			System.out.println("It is not present");
		}
		
		System.out.println(day.startsWith("Today"));
		boolean stringPresent = day.endsWith("Strings");
		System.out.println(stringPresent);
		
		char ret = transaction.charAt(0);
		System.out.println(ret);
		
		System.out.println(transaction.indexOf('5'));
		String email = "Hello123@gmail.com";
		System.out.println(email.indexOf('@'));
		
		System.out.println(email.substring(8));
		System.out.println(email.substring(0, 8));
		
		String title = "Welcome to car dealer$hip";
		System.out.println("Title");
		
		

	}

}
