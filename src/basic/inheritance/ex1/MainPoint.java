package basic.inheritance.ex1;

public class MainPoint {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20, "빨간점");		
		System.out.println(p1);
		
		ColorPoint cp1 = new ColorPoint(100, 200, "BLUE");
		System.out.println(cp1);
	}

}
