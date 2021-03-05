package PDF_jeongSeok_2021;

public class Ex_4_10 {

	public static void main(String[] args) {
		// int타입 변수 num. 각 자리의 합을 더한 결과를 출력하는 코드를 완성하시오.
		int num = 12345;
		int sum = 0;
		
		
		while(num >0) {
			sum += num%10;
			num /= 10;
			System.out.println("sum=" + sum +",num="+num);
		}
		
		System.out.println("sum=" + sum);
	}

}
