package basic.inheritance.ex3;

public class MainAB {

	public static void main(String[] args) {
		A a = new A(10);
		
		B b = new B(10, 20);	// 객체, 인스턴스
		B b2 = b;
		
		b2.setA(100);
		System.out.println(b.getA());
		System.out.println(b2.getA());

	}

}
