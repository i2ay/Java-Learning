package java_data_types;

public class Day04_NestedIf_Examples {
	
	
	public static void main(String[] args) {
		//18 apply for learner
		//greater than 18 apply for license
		//greater than 21 cam start working
		// age greater than 65 is ready to retire
		
		int age = 98;
		String name = "John";
		
		if(age < 18) {
			System.out.println(name + " apply for permit.");
		} else {
			System.out.println(name + " is greater than age 18, he can apply for drivers license");
			if(age < 21) {
				System.out.println(name + " is less than 21, you are not ready to work");
			} else {
				System.out.println(name + " is greater than 21, you can start working");
				if(age < 65) {
					System.out.println(name + " can continue to work");
				} else {
					System.out.println(name + " is ready to retire");			
				}
			}
		}
	}	

}
