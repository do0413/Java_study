package PDF_jeongSeok_2021;

public class Ex_4_2 {
	public static void main(String[] args) {
		
		int i;
		int sum=0;
		
		for(i=1; i<=20; i++) {
			if( !( i%2==0 || i%3==0)) {
				sum += i;
			}
		}
		System.out.println("1~20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합 :" + sum);
	}//main
}
