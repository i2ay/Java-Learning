package java_data_types;

public class Day22_Encapsulation {

	public static void main(String[] args) {

		Day22_Employee_Information a = new Day22_Employee_Information();
		a.setName("Ryan");
		System.out.println(a.getName());

		a.setSsn(111111111);
		System.out.println(a.getSsn());

		a.setGraduated(false);
		System.out.println(a.getGraduated());
	}

}
