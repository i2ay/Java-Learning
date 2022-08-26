package java_data_types;

class Phone1 {
	String make = "Apple";
	String color = "black";
}

class smartPhone extends Phone1 {
	String make = "Samsung";
	String color = "Yellow";
	void hello() {
		System.out.println("This method is in the child class");
	}
	
	void displayChildMake() {
		System.out.println("The phone is :" +make);
		System.out.println("The phone is :" +color);
}
	void displayParentMembers() {
		System.out.println("This will print parent members :"+super.make);
		System.out.println("This will print the color "+super.color);
	}
	public class Day19_Super {
		public static void main(String[] args) {
			smartPhone a = new smartPhone();
			a.displayChildMake();
			a.displayParentMembers();
			
		}
	}

}
