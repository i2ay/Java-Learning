package java_data_types;

public class Day11_Methods {

	public static void main(String[] args) {
	//	name();
	//	name2("John");
	//	name2("Ali");
		
	//	name3("John", 25);
	//	name3("Mike", 35);
	//String a = day(); //returns string value
	//System.out.println(a);
	
	//String b = month();
	//System.out.println(b);
	
	//int aa = year();
	//System.out.println(aa);
	String value = topic(" void and non void methods");
	System.out.println(value);
	System.out.println(topic(" parameterized and non parameterized methods"));
	}
	public static String topic(String a) {
		return "Today we are learning"+ a;
	}
	
	public static String day() {
		String todaysDay = "Tuesday";
		return todaysDay;
	}
	public static String month() {
		return "August";
	}
	public static int year() {
		int year = 2022; 
		return year; 
	}
	
	public static void sample() {
		System.out.println("Hello world");
	}
	
	public static void hello() {
		System.out.println("Today we are learning Methods");
	}
	public static void sum() {
		int a = 5;
		int b = 10;
		System.out.println(a+b);
	}
	public static void add(int a, int b) {
		System.out.println(a + b);
		
	}
	public static void name() {
		System.out.println("My name is Ryan Sohail");
	}
	public static void name2(String a) {
		System.out.println("My name is "+ a);
	}
	public static void name3(String name, int age) {
		System.out.println(name + " is " + age + " years old.");
	}

}
