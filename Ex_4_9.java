package PDF_jeongSeok;

import java.util.Scanner;

public class Ex_4_9 {

	public static void main(String[] args) {
		// ���ڷ� �̷���� ���ڿ�str. �� �ڶ��� ���� ���� ����� ����ϴ� �ڵ�.
		String str = "12345";
		int sum=0;
		int num = Integer.parseInt(str);
		
		for(int i=0; i<str.length(); i++) {
			
			sum += num%10;//5,4,3,2,1
			num = num/10; //1234,123,12,0
		}
		System.out.println("sum=" + sum);
		
	}

}
