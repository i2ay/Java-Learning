package java_data_types;

import java.util.Scanner;

public class Day07_LoopsSzn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Let user input born month and system replies the season. (Use scanner//if else or swithc//for loop)

		Scanner takeInput = new Scanner(System.in);

		System.out.println("Enter your birth month : ");
		String month = takeInput.next();
		
	

		switch (month) {

		case "January":
			System.out.println("Winter");
			break;
		case "February":
			System.out.println("Winter");
			break;
		case "March":
			System.out.println("Winter");
			break;
		case "April":
			System.out.println("Spring");
			break;
		case "May":
			System.out.println("Spring");
			break;
		case "June":
			System.out.println("Spring");
			break;
		case "July":
			System.out.println("Summer");
		case "August":
			System.out.println("Summer");
		case "September":
			System.out.println("Summer");
		case "October":
			System.out.println("Fall");
		case "November":
			System.out.println("Fall");
		case "December":
			System.out.println("Fall");
			break;
		default:
			System.out.println("You have enterred an invalid month.");
		}
	}
}
			


