import java.util.Random;

public class DowhileEx1 {
	public static void main(String[] args) {
		int i;
		do {
			 i = new Random().nextInt(100);//0부터 100까지 난수발생
		} while(i % 3 != 0); //3의 배수
		//(i % 2 != 1) 홀수만 (i % 2 == 0) 짝수만
		
		System.out.println("난수: " + i);
		
		
	}
}
