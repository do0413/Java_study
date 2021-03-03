package PDF_jeongSeok;

import java.util.Scanner;

public class Ex_4_9 {

	public static void main(String[] args) {
		// 숫자로 이루어진 문자열str. 각 자라의 합을 더한 결과를 출력하는 코드.
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
