package collections.generic.ex2;

import lombok.ToString;

@ToString
public class MyGenArray<T> {

	private T[] arr;

	public MyGenArray(int size) {
		arr = (T[]) new Object[size]; 
	}

	public T getArr(int index) {
		return arr[index];
	}

	public void setArr(int index, T value) {
		arr[index] = value;
	}
	
	public int length() {
		return arr.length;
	}
	
	
}
