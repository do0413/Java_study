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
		System.out.println("1~20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ���� :" + sum);
	}//main
}
