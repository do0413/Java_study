package PDF_jeongSeok_2021;

import java.util.Scanner;

public class Ex_4_14 {
	public static void main(String[] args) {
		//숫자 맞추기 게임. (업다운)
		//1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100)+1;
		int input =0;
		int count =0;
		
		//화면으로 부터 사용자 입력을 받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("1과 100사이에서 아무값이나 말해보세요 !");
		do {		
			input = scanner.nextInt();
			
			if(input == answer) {
				System.out.println("정답입니다 !!");
			}else if (input < answer) {
				System.out.println("좀더 큰 숫자를 불러보세요.");
			}else {
				System.out.println("좀더 작은 숫자를 불러보세요.");
			}
			
		} while(true);//무한반복문
	}
}
