package PDF_jeongSeok_2021;

import java.util.Scanner;

public class Ex_4_14 {
	public static void main(String[] args) {
		//���� ���߱� ����. (���ٿ�)
		//1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random()*100)+1;
		int input =0;
		int count =0;
		
		//ȭ������ ���� ����� �Է��� �޴´�.
		Scanner scanner = new Scanner(System.in);
		System.out.println("1�� 100���̿��� �ƹ����̳� ���غ����� !");
		do {		
			input = scanner.nextInt();
			
			if(input == answer) {
				System.out.println("�����Դϴ� !!");
			}else if (input < answer) {
				System.out.println("���� ū ���ڸ� �ҷ�������.");
			}else {
				System.out.println("���� ���� ���ڸ� �ҷ�������.");
			}
			
		} while(true);//���ѹݺ���
	}
}
