package PDF_jeongSeok_2021;

import java.util.Scanner;

public class Ex_5_12 {

	public static void main(String[] args) {
		// 단어맞추기 게임
		String[][] words = {
				{"chair","의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		int[] score = {0,0};
		Scanner scanner= new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			score[0]++;
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				score[1]++;
				System.out.printf("정답!%n%n");
			}else {
				System.out.printf("오답! 정답은 %s입니다. %n%n", words[i][1]);
			}
		}
		
		System.out.printf("전체 %s문제 중 %s문제 맞추셨네요!",score[0],score[1]);
		
	}

}
