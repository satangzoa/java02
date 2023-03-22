package classex;

public class ClassEx1 {
	public static void main(String[] args) {
		Student s1; //참조변수(4byte) s1 s2는 지역변수
		s1 = new Student();
		
		Student s2 = new Student();
		
		s1.studentNo = "s001";
		s1.name = "홍길동";
		s1.age = 15;
		
		s2.studentNo = "s002";
		s2.name = "이순신";
		s2.age = 24;
		
		s1.displayInfo();
		s2.displayInfo();
		
//		System.out.println("학번: " + s1.studentNo);
//		System.out.println("이름: " + s1.name);
//		System.out.println("나이: " + s1.age);
//		
//		System.out.println("---------------------------");
//		
//		System.out.println("학번: " + s2.studentNo);
//		System.out.println("이름: " + s2.name);
//		System.out.println("나이: " + s2.age);
//		System.out.println("---------------------------");
	}
}

class Student {
	String studentNo; //학번
	String name; // 이름
	int age; // 나이
	
	void displayInfo() {
		
		System.out.println("학번: " + studentNo);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("---------------------------");
	}
	
}



