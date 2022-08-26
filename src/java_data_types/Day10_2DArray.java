package java_data_types;

public class Day10_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries = new String[2][2];
		countries[0][0] = "USA";
		countries[0][1] = "Canada";
		countries[1][0] = "Switzerland";
		countries[1][1] = "Japan";
		
		System.out.println(countries [1][1]);
		System.out.println(countries [0][0]);
		
		
		String[][] _countries = { 
				{ "Canada", "USA" } , 
				{ "Switzerland", "Japan" },
				{ "Germany", "England" }
				};
		
		System.out.println(_countries.length);
		System.out.println(_countries[0].length);
		
		for(int rows=0; rows < _countries.length; rows++) {
			for (int column=0; column < _countries[rows].length; column++) {
				System.out.println(_countries[rows][column]);
			}
		}
		
		
		
	}

}
