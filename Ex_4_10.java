package PDF_jeongSeok;

public class Ex_4_10 {

	public static void main(String[] args) {
		// intŸ�� ���� num. �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��Ͻÿ�.
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
