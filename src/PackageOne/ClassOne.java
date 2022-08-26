package PackageOne;

import PackageTwo.ClassThree;

public class ClassOne {
	public int a1 = 10; 
	private int b1 = 20;
	int c1 = 90;

	public static void main(String[] args) {
		ClassOne c1 = new ClassOne();
		c1.methodSeven();
		System.out.println(c1.c1);
		
		ClassFour c4 = new ClassFour();
		System.out.println(c4.a4);
		
		ClassThree c3 = new ClassThree();
		System.out.println(c3.a3); 
	}
		
		static void methodSeven() {
		System.out.println("This is method Seven");
	}
	public static void methodOne() {
		System.out.println("This is method 1.");
	}
	private static void methodFour() {
		System.out.println("This is method 4.");
	}
}
