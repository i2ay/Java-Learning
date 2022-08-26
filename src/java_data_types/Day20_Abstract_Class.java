package java_data_types;

abstract class Furniture {

	abstract void color();

	abstract void material();

	abstract void weight();

}

abstract class chair extends Furniture {

	void color() {
		System.out.println("This is color method");
	}

	void material() {
		System.out.println("This is material method");
	}

	abstract void dimension();

}

class brand extends chair {
	void dimensions() {
		System.out.println("This is dimension method");
	}

	void weight() {
		System.out.println("This is weight method");
	}

	@Override
	 void dimension() {
		// TODO Auto-generated method stub
		
	}
}

public class Day20_Abstract_Class {

	public static void main(String[] args) {
		brand b = new brand();
		b.color();
		b.material();
		b.dimension();
		b.weight();
		
	}

}
