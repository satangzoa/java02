package classex;

public class ClassEx2 {
	public static void main(String[] args) {
		Car c1 = new Car(); 
		
		c1.name = "승용차";
		c1.color = "빨강";
		c1.maxSpeed = 150;
		
		Car c2 = new Car("전기자동차", "검정색", 200);
		
		Car c3 = new Car("트럭", "흰색");
		
		c1.displayInfo();
		c2.displayInfo();
		c3.displayInfo();
		
	}
}

class Car {
	Car() { 
		System.out.println("생성자1이 호출되었습니다...");
	}
	
	Car(String name, String color) { 
		System.out.println("생성자2가 호출되었습니다...");
		
		this.name = name; 
		this.color = color;
	
	}
	
	
	Car(String name, String color, int maxSpeed) { 
		this(name, color);
		System.out.println("생성자3이 호출되었습니다...");
		
		this.maxSpeed = maxSpeed;
	}
	
	
	String name; 
	String color; 
	int maxSpeed; 
	

	void displayInfo() {
		
		System.out.println("이름: " + name);
		System.out.println("색상: " + color);
		System.out.println("최고속도: " + maxSpeed);
		System.out.println("---------------------------");
	}
	
}





