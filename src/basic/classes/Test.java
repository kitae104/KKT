package basic.classes;

public class Test {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;		
		
		int result = StaticClass.add(a, b);		
		System.out.println(result);
		
		System.out.println(Math.PI);
		System.out.println(Math.random());
		
		for (int i = 0; i < StaticClass.MAX_VALUE; i++) {
			
		}
	}
}
