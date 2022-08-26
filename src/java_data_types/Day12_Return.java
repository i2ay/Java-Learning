package java_data_types;

public class Day12_Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = task();
		if(sum%2==0) {
			System.out.println("The sum is even");
		} else {
			System.out.println("The sum is odd");
		}
	}

	
	
	
	
	public static int task() {
		int a = 5;
		int b = 90;
		int sum = a + b;
		return sum;
	}
}
