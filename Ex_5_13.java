package PDF_jeongSeok_2021;

import java.util.Scanner;

public class Ex_5_13 {

	public static void main(String[] args) {
		// 단어의 글자위치를 섞어서 보여주고 원래 단어를 맞추기.
		
		String[] words= {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
			//System.out.println(words[i].toCharArray());
			for(int j=0; j<question.length; j++) {
				char num1 =question[j];
				int num2= (int)(Math.random()*question.length);
				question[j]=question[num2];
				question[num2]=(char) num1;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>",i+1,new String(question));
			String answer=scanner.nextLine();
			
			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
			if(words[i].equals(answer.trim()))
			System.out.printf("정답!!%n%n");
			else
			System.out.printf("오답!!%n%n");
		}
		
		

	}

}
