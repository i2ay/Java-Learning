package java_data_types;

import java.util.Scanner;

public class Day05_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner getInput = new Scanner(System.in);
		
		System.out.println("enter the first value : ");
		int aa = getInput.nextInt();
		
		System.out.println("enter the second value : ");
		int bb = getInput.nextInt();		
		
		int cc = aa+bb;
		
		System.out.println("the sum is : "+cc);
		

			
	}

}
