package PDF_jeongSeok_2021;

import java.util.Scanner;

public class Ex_5_13 {

	public static void main(String[] args) {
		// �ܾ��� ������ġ�� ��� �����ְ� ���� �ܾ ���߱�.
		
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
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>",i+1,new String(question));
			String answer=scanner.nextLine();
			
			// trim() answer , equals word[i] ���� �� �¿� ������ ������ �� �� �� ��
			if(words[i].equals(answer.trim()))
			System.out.printf("����!!%n%n");
			else
			System.out.printf("����!!%n%n");
		}
		
		

	}

}
