package java_data_types;

public class Day02_AssignedValues {
	//default value
	static int b; 
	static char c; 
	static double e;
	static float g; 
	static boolean i;
	static String k;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable name is a and value is 5
		int a = 5;
		//declared a variable b
		System.out.println(a);
		System.out.println(b);
		//initialize a char variable d
		char d = 'h'; 
		System.out.println(c);
		System.out.println(d);
		double f = 10.78347583456834583456384;
		System.out.println(e);
		System.out.println(f);
		float h = 10.8237428347283462834283f;
		System.out.println(g);
		boolean j = true;
		System.out.println(i);
		System.out.println(j);
		String l = "hello";
		System.out.println(k);
		System.out.println(l);
		
		String first_name = "Ryan";
		String last_name = "Sohail";
		System.out.println(first_name + last_name);
		System.out.println(first_name + ' ' + last_name);
		System.out.println("Ryan" + ' ' + "Sohail");
		System.out.println("*****************************************");
		System.out.println("Arithmetic Example");
		System.out.println("*****************************************");
		
		int value1 = 5;
		int value2 = 10; 
		//addition
		System.out.println("addition");
		System.out.println(value1 + value2); 
		
		System.out.println("sum");
		int sum = value1 + value2;
		System.out.println(sum);
		
		
		System.out.println(value1);
		
		//subtraction 
		System.out.println("sub");
		System.out.println(value1-value2);
		int sub = value1 - value2; 
		System.out.println(sub);
		
		//division
		System.out.println("div");
		System.out.println(value1 / value2);
		int div = value1/value2;
		
		//multiplication
		System.out.println("mul");
		System.out.println(value1 * value2);
		int mul = value1 * value2;
		
		//mod
		System.out.println("mod");
		System.out.println(value1 % value2);
		int mod = value1%value2; 
		
		int m = 1000; 
		double n = 20.2783458298356782; 
		char o = 'c';
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		int p = 5;
		double q = 6.2;
		System.out.println(p+q);
		
		float r = 3.9f;
		System.out.println(r*r);
		
		byte length = 2;
		byte width = 3; 
		int area = length * width;
		System.out.println(area);
		
		int aa = 500;
		int bb = 600; 
		
		System.out.println(500 == 600);
		System.out.println(aa == bb);
		
		boolean cc = aa == bb;
		System.out.println(cc);
		
		System.out.println(aa!=bb);
		boolean dd = aa!=bb;
		System.out.println(dd);
		
		System.out.println(aa > bb);
		boolean ee = aa>bb;
		System.out.println(ee);
		
		System.out.println(200 >=200);
		boolean ff = 200 >= 200;
		System.out.println(ff);
		
		System.out.println(100 < 200);
		boolean gg = 100 < 200;
		System.out.println(gg);
		
		System.out.println(2000 <= 300);
		boolean hh = 2000 <= 300;
		System.out.println(hh);
		
		
		
		
		
		
	}

}
