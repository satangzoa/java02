package classex;

public class ClassEx1 {
	public static void main(String[] args) {
		Student s1; //참조변수(4byte) s1 s2는 지역변수
		s1 = new Student();
		
		Student s2 = new Student("s002", "이순신", 24);
		
		s1.studentNo = "s001";
		s1.name = "홍길동";
		s1.age = 15;
		
//		s2.studentNo = "s002";
//		s2.name = "이순신";
//		s2.age = 24;
		
		Student s3 = new Student("s002", "김삿갓");
		
		
		s1.displayInfo();
		s2.displayInfo();
		s3.displayInfo();
		
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
	Student() { 
		System.out.println("생성자1이 호출되었습니다...");
	}
	
	Student(String studentNo, String name) { //studentNo 지역변수 
		System.out.println("생성자2가 호출되었습니다...");
		
		this.studentNo = studentNo; 
		this.name = name;
	
	}
	
	
	Student(String studentNo, String name, int age) { //studentNo 지역변수 
		// 같은 클래스 내의 다른 생성자를 호출하여 기존 코드를 활용
		this(studentNo, name);
		System.out.println("생성자3이 호출되었습니다...");
		
//		this.studentNo = studentNo; 
//		this.name = name;
		this.age = age;
	}
	
	
	//멤버변수(필드) 자동 초기화된다
	String studentNo; //학번
	String name; // 이름
	int age; // 나이
	
	//메서드
	void displayInfo() {
		
		System.out.println("학번: " + studentNo);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("---------------------------");
	}
	
}



