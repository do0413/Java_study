package PDF_jeongSeok_2021;

import java.util.Scanner;

public class Ex_5_12 {

	public static void main(String[] args) {
		// �ܾ���߱� ����
		String[][] words = {
				{"chair","����"},
				{"computer", "��ǻ��"},
				{"integer", "����"}
		};
		int[] score = {0,0};
		Scanner scanner= new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			score[0]++;
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				score[1]++;
				System.out.printf("����!%n%n");
			}else {
				System.out.printf("����! ������ %s�Դϴ�. %n%n", words[i][1]);
			}
		}
		
		System.out.printf("��ü %s���� �� %s���� ���߼̳׿�!",score[0],score[1]);
		
	}

}
