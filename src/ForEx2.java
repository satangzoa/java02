
public class ForEx2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0)//짝수이면
			System.out.println(i);
		}
	
	
	for (int i = 1; i <= 100; i++) {
		if(i % 2 == 1) //홀수이면
			continue; //다음 번 반복을 수행
		System.out.println(i);
	}
	}
	
}
