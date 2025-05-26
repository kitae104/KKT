package basic.cast;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person{
	private String grade;
	private String dept;
	
	public Student(String name) {
		super(name);
	}
	
	
	
	

}
