package basic.inheritance.ex1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@ToString
public class ColorPoint extends Point{
	
	public ColorPoint(int x, int y, String color) {
		super(x, y, "");
		this.color = color;
	}

	private String color;

	@Override
	public String toString() {
		return "ColorPoint ("+ color + ",(" + super.toString() + ")";
	}
	
	
}
