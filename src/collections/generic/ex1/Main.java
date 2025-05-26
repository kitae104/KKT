package collections.generic.ex1;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		MyClass<Integer> mc2 = new MyClass<Integer>();
		mc2.setVal(1);
		mc2.getVal();
		
		MyClass<String> mc1 = new MyClass<String>();
		mc1.getVal();
		mc1.setVal("");
		
		
	}

}
