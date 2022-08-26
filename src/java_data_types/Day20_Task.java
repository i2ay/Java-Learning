package java_data_types;

abstract class Car {
	
	abstract void make();
	
	abstract void color();
	
	abstract void year();
}

abstract class bike extends Car {

	void make() {
		System.out.println("This is make method");
	}
	void color() {
		System.out.println("This is color method");
	}
	
	abstract void size();
	
}

class truck extends bike {
	void size() {
		System.out.println("This is size method");
	}

	public void year() {
		// TODO Auto-generated method stub
		
	}
}

public class Day20_Task {

	public static void main(String[] args) {
truck t = new truck();
t.make();
t.color();
t.size();
t.year();
	}

}
