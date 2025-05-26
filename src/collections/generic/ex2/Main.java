package collections.generic.ex2;

public class Main {

	public static void main(String[] args) {
		MyGenArray<Integer> arr2 = new MyGenArray<Integer>(4);
		arr2.setArr(0, 10);
		arr2.setArr(1, 20);
		arr2.setArr(2, 30);
		arr2.setArr(3, 40);
		int sum = 0;
		for (int i = 0; i < arr2.length(); i++) {
			sum += arr2.getArr(i);
		}
		System.out.println("총점 : " + sum);
		
		MyGenArray<String> array = new MyGenArray<String>(3);
		array.setArr(0, "Apple");
		array.setArr(1, "Banana");
		array.setArr(2, "Cherry");
		System.out.println(array);
		for (int i = 0; i < array.length(); i++) {
			System.out.println(array.getArr(i));
		}
		
		

	}

}
