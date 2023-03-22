
public class MethodEx1 {
	public static void main(String[] args) {
		printSeperator();
		System.out.println("이름: 홍길동");
		printSeperator();
		printResult(10, 20);
		int result = calculate(30, 40);
		System.out.println("덧셈결과: " + result);
		
		System.out.println("정수 덧셈결과: " + calculate(50, 60, 70));
		
		
		System.out.println("실수 덧셈결과: " + calculate(50.0, 60.0, 70.0));
	}
	
	static void printSeperator() {
		System.out.println("==========");
	} 

	static void printResult(int v1, int v2) {
		int result = v1 *  v2;
		System.out.println("곱셈 결과: " + result);
	}
	
	static int calculate(int v1, int v2) {
		int result = v1 + v2;
		return result;
	}
	
	static int calculate(int v1, int v2, int v3) {
		int result = v1 + v2 + v3;
		return result;
	}
	
	static double calculate(double v1, double v2, double v3) {
		double result = v1 + v2 + v3;
		return result;
	}
}




