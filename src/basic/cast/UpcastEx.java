package basic.cast;

public class UpcastEx {

	public static void main(String[] args) {
		Person  p;
		Student s = new Student("김기태");
		p = s; // 업캐스팅 발생
//		
		System.out.println(p.getName()); // 오류 없음
		
		Person p1 = new Person("홍길동");
		Student s1 = (Student)p1; 

	}

}
