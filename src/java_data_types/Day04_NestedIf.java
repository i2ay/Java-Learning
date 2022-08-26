package java_data_types;

public class Day04_NestedIf {

	
	public static void main(String[] args) {
		
		// VP 2000 sr/jr, IT_PROG 120000, ANALYST 80000
		
		String title = "IT_PROG";
		String role = "junior";
		
		if (title == "VP") {
			System.out.println("Vice President");
			if(role == "junior") {
				System.out.println("Salary is $200,000");
			} else if(role == "senior") {
				System.out.println("Salary is $250,000");		
			} else {
				System.out.println("The role does not exist.");
			}
		} else if (title == "IT_PROG") {
			System.out.println("IT_Programmer");
		
		} else if (title == "ANALYST") {
			System.out.println("System Analyst");
			if(role == "junior") {
				System.out.println("Salary is $80,000");
			} else if(role == "senior") {
				System.out.println("Salary is $130,000");		
			} else {
				System.out.println("The role does not exist.");
			}
		} else {
			
			System.out.println("The role does not exist.");
		}
		
	}	
}