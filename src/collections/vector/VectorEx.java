package collections.vector;

import java.awt.Point;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector vec = new Vector();
		vec.add(new Point(10, 20));
		vec.add(1);
		vec.add("AAA");
		
		Iterator iter = vec.iterator();
		while(iter.hasNext()) {
			Point next = (Point)iter.next();
			System.out.println(next.getX());
		}
		
	}
	
	
}
