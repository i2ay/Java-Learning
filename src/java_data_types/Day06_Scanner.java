package java_data_types;

import java.util.Scanner;

public class Day06_Scanner {

	public static void main(String[] args) {
		// how to create an object
		//classname objectname = new classname();
		Scanner takeInput = new Scanner(System.in);
		System.out.println("Enter the int value : ");
		int val1 = takeInput.nextInt();
		System.out.println("The entered value is : "+ val1);
		
		//next boolean (true, false)
		System.out.println("Is it raining outside : ");
		boolean val2 = takeInput.nextBoolean();
		System.out.println("If it is true it is raining, if its false then its not raining : "+ val2);
		
		//next line (String)
		System.out.println("Enter your name : ");
		String name = takeInput.next();
		System.out.println("The name you entered is : "+ name);
		
		
		//nextfloat
		System.out.println("Enter the floating value : "+ name);
		float temp = takeInput.nextFloat();
		System.out.println("The temp is : "+ temp);
		
		
	}

}
