package java_data_types;

public class Day07_LoopsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print even numbers between 20 and 50
		
		for (int i = 20; i <= 50; i++) {
			if (i%2 == 0) {
				System.out.println(i);		
			}
		}	
		
		for (int i = 20; i <= 50; i++) {
			if (i%2 == 1) {
				System.out.println(i);		
			}
		}	

	}

}
