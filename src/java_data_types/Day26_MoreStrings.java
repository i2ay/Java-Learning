package java_data_types;

public class Day26_MoreStrings {

	public static void main(String[] args) {
		String a = "Hello";
		String b = a + "World";
		System.out.println(b);

		StringBuffer aa = new StringBuffer("Hello");
		aa.append("World");
		aa.append("Today we are learning string buffer");
		System.out.println(aa);
		aa.insert(5, ' ');
		System.out.println(aa);
		aa.insert(11, ' ');
		System.out.println(aa);
		aa.insert(0, "Good evening. ");
		System.out.println(aa);
		aa.reverse();
		System.out.println(aa);
		aa.reverse();
		System.out.println(aa);
		aa.delete(12, 24);
		System.out.println(aa);

	}

}