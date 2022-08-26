package java_data_types;

import java.util.Scanner;

public class Day16_ConstructorExample {

	public static void main(String[] args) {
		Day16_Constructor cons = new Day16_Constructor();		
		Day16_Constructor para_cons = new Day16_Constructor("Administrator");
		Day16_Constructor para_cons2 = new Day16_Constructor("Editor");
		Day16_Constructor twopara_cons = new Day16_Constructor("Admin","qa.codegator.us");
		
		Day16_Constructor int_cons = new Day16_Constructor(1000);

		cons.hello();
		para_cons.hello();
	
	
	
	}

}
