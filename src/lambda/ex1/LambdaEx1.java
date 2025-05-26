package lambda.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaEx1 {

	public static void main(String[] args) {
		
		int[] arr = {1, 4, 5, 3, 2};
		IntStream.of(arr).map(n -> n * n).forEach(System.out::println);
		IntStream.of(arr).sorted().forEach(System.out::println);
		
		System.out.println("============================");
		
		new ArrayList<Integer>(List.of(1, 4, 5, 3, 2)).forEach(System.out::println);
		
		
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.forEach(s -> System.out.println(s)); // 람다식
	}

}
