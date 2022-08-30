package java_data_types;

import java.util.Scanner;

public class Day27_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 6 / 2;
			System.out.println(a);
			
			String b = "2hello";
			System.out.println(b.length());
			
	
			int[] c = new int[2];
			c[0] = 1;
			c[1] = 200;
			c[2] = 300;
			System.out.println(c[2]);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
