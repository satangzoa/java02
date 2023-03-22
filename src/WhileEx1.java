
public class WhileEx1 {
	public static void main(String[] args) {
		int n = 1;
		
		while(n <= 10) {
			System.out.println("운동장을 "+ n + " 바퀴째 돕니다.");
			n++; // n = n +1;
		}
		
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i <10; i++) {
		
			System.out.println("운동장을 "+ (i + 1) + " 바퀴째 돕니다.");
		}
		
		}
}
