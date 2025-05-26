package collections.vector;

import java.awt.Point;
import java.util.Vector;

public class VecterEx2 {

	public static void main(String[] args) {
				
		Vector<String> sVec = new Vector<String>(3); 
		sVec.add("AAA");
		sVec.add("BBB");
		sVec.add("111");
		sVec.add("CCC");
		sVec.add(2, "DDD");
		System.out.println(sVec.capacity());
		System.out.println(sVec.size());
		System.out.println(sVec.contains("222"));
		System.out.println(sVec.get(0));
		
		System.out.println("=============================");
		for (String str : sVec) {
			System.out.println(str);
		}	
		
	}

}
