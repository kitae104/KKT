package basic.cast;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
	private String name;
	private String id;
	
	public Person(String name) {
		super();
		this.name = name;
	}	
	
}
