package mission;

import java.util.Random;

public class GuessGame {
		
		public static void main(String[] args) {
			System.out.println("1부터 100사이의 랜덤값: ");
			
			//사용자가 난수를 맞출 때까지 반복하는 코드를 반복문(do~while)으로 작성한다.
			
			int randomNum;
			
			do {
				randomNum = new Random().nextInt(100);
			} while(randomNum >=100);
			
			System.out.println(randomNum);
			
		}
		
//		public static int getValidNumber() 
//		{
//			//"1부터 100사이의 값을 입력하세요 : " 메시지를 화면에 출력하고, 
//			//사용자로부터 숫자를 입력 받아 그 수를 리턴한다. 
//			//만약 사용자가 입력한 값이 숫자가 아니거나 1부터 100사이의 값이 아닌 경우, 
//			//올바른 숫자를 입력할 때까지 메시지를 출력하고 숫자의 입력 작업을 반복한다.
//			
//			System.out.println("1부터 100사이의 값을 입력하세요 : ");
//			
//			int inputNum = 0;
//			
//		
//			
//				return inputNum;
//		}
		
	
		
		
//}
//		
		
	}
