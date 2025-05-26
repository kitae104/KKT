package lambda.ex3;

@FunctionalInterface
interface Func1{
	void aaa();	// 매개변수 X, 반환값 X
}

@FunctionalInterface
interface Func2{	// Consummer<T>
	void bbb(String a, String b);	// 매개변수 O, 반환값 X
}

@FunctionalInterface
interface Func3{	// Supplier<T>
	String ccc();	// 매개변수 X, 반환값 O
}

@FunctionalInterface
interface Func4{	// Functional<T>
	String ddd(String a, String b);	// 매개변수 O, 반환값 O
}

public class LambdaEx4 {

	public static void main(String[] args) {
		
		Func4 f4 = (a, b) -> {
				String res3 = a + " " + b;
				return res3;
			};
		
		String res4 =  f4.ddd("AAA", "BBB");
		System.out.println(res4);
		
		
		Func3 f3 = () -> "김기태"; 
		
		String res2 = f3.ccc();
		System.out.println(res2);
		
		Func2 f2 = (a, b) -> {
				String res = a + " " + b;
				System.out.println(res);				
			};
		
		f2.bbb("인하공전", "컴시과");
		
		Func1 f1 =   () -> System.out.println("람다 연습중...");		
		f1.aaa();
	}

}






