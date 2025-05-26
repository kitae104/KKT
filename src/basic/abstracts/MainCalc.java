package basic.abstracts;

public class MainCalc {

	public static void main(String[] args) {
		Calc calc = new RealCalc();
			;
		
		int result = calc.sub(10, 20);
		System.out.println(result);
	}

}
