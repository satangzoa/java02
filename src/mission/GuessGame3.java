package mission;

import java.util.Random;

public class GuessGame3 {
	public static void main(String[] args) {
		
		System.out.print("1부터 100사이의 값을 입력하세요: ");
		
//		
//		int randomNum;
//		
//		do {
//			randomNum = new Random().nextInt(100);
//		} while(randomNum >=100);
//		
//		System.out.println(randomNum);
		int randomNum = (int)(Math.random()*100)+1;
		
			
			if(randomNum>=50)
			System.out.println("값이 너무 큽니다.");
			else if(randomNum<=25)
			System.out.println("입력하신 값은 약간큽니다.");
			else if(randomNum<=19)
				System.out.println("입력하신 값은 아주 약간 큽니다.");
			else if(randomNum==18)
		System.out.println("맞추셨습니다.");
	}
}
