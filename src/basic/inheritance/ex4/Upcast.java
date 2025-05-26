package basic.inheritance.ex4;

public class Upcast {

	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new A();
		a1 = a2;
		
		B b1 = new B();
		B b2 = new B();
		b1 = b2;
		
		a1 = b1;	// upcast
		
		b2 = (B)a2;	// downcast
		
		
		int a = 10;
		double d = 1.1;
		
		a = (int)d;

	}

}
