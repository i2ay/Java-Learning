package java_data_types;

public class Day15_GlobalVariables {
	
	String phone = "Iphone";
	String color = "black";
	static int memory = 32;

	public static void main(String[] args) {
		Day15_GlobalVariables johnPhone = new Day15_GlobalVariables();
		System.out.println(johnPhone.phone);
		System.out.println(johnPhone.color);
		System.out.println(johnPhone.memory);
		
		Day15_GlobalVariables stevePhone = new Day15_GlobalVariables();
		stevePhone.phone = "Iphone13";
		stevePhone.color = "Red";
		stevePhone.memory = 64; 
		System.out.println(stevePhone.phone);
		System.out.println(stevePhone.color);
		System.out.println(stevePhone.memory);
		
		Day15_GlobalVariables mikePhone = new Day15_GlobalVariables();
		System.out.println(mikePhone.color);
		System.out.println(mikePhone.phone);
		
		Day15_GlobalVariables vinPhone = new Day15_GlobalVariables();
		vinPhone.possible();
		
	}
	public static void possible () {
		Day15_GlobalVariables vinPhone = new Day15_GlobalVariables();
		vinPhone.phone = "Iphone 12";
		vinPhone.color = "grey";
		System.out.println(vinPhone.phone);
		System.out.println(vinPhone.color);
		System.out.println(vinPhone.memory);
	}

}
