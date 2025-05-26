package basic.abstracts;

public abstract class Calc {
	
	private int a; 
	private int b; 
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public abstract int sub(int a, int b); 
	public abstract int mul(int a, int b); 
	
	
}
