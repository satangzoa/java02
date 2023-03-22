package mission;

import java.util.Scanner;

public class GuessGame2 {
	public static void main(String[] args) {
		
		  int origin_num = (int)(Math.random()*100)+1;
	        int subject_num = 0;
	        boolean run = true;
	        int i =0; //시도횟수
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("1~100까지 어떤 수일지 맞혀 보세요: ");
	        while(run) {
	            subject_num = sc.nextInt();
	            
	            if(subject_num == origin_num) {
	                System.out.println("정답입니다."+(i+1)+"번째 만에 맞히셨습니다.");
	                break;
	            } 
	            
	            if(subject_num > origin_num) {
	                System.out.println("입력하신 값보다 작은수를 입력해보세요");
	            } else {
	                System.out.println("입력하신 값보다 큰수를 입력해보세요.");
	            }
	            i++;
	        }
	}
}
