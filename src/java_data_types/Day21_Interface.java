package java_data_types;

interface example {

	void test();

	void test2();

	void test3();

	int a = 10;
}

interface example3 {
	void test4();
}

class example2 implements example, example3 {
	public void test() {
		System.out.println("Test Method");
	}

	public void test2() {
		System.out.println("Test 2 Method");
	}

	public void test3() {
		System.out.println("Test 3 Method");
	}

	@Override
	public void test4() {
		System.out.println("Test 4 Method");
	}

}

public class Day21_Interface {

	public static void main(String[] args) {
		example ex = new example2();
		ex.test();
		ex.test2();
		ex.test3();

		example2 ex2 = new example2();
		ex2.test();
		ex2.test2();

	}

}
