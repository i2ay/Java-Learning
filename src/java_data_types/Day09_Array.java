package java_data_types;

public class Day09_Array {

	public static void main(String[] args) {
		
		int a;
		a=50;
		
		int[] _rollNumber = new int[5];
		_rollNumber[0] = 500;
		_rollNumber[1] = 300;
		_rollNumber[2] = 100;
		_rollNumber[3] = 400;
		
		
		int[] rollNum = { 100,200,300,400,500 };
		System.out.println(rollNum[3]);
		
		System.out.println(rollNum.length);
		
		for(int i=0;i<rollNum.length;i++) {
			System.out.println(rollNum[i]);
		}

	}

}
