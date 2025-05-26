package basic.inheritance.ex1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@ToString
public class Point {
	// 속성
	private int x;
	private int y;
	private String name;
	
	// 생성자 - 속성에 대한 초기화
	public Point(int x, int y, String name) {
		//super();		// 부모 호출 생성자
		this.x = x;
		this.y = y;
		this.name = "";
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
