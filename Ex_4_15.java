package PDF_jeongSeok;

public class Ex_4_15 {
	public static void main(String[] args) {
		//ȸ������ ���ϴ� ���α׷�. 
		int number =12321;
		int tmp = number;
		
		int result =0;// ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while(tmp !=0) {
			result = result*10 + tmp %10; //10�� ���ؼ� Ƚ���� �ŵ��Ҽ��� �տ� ���� ���ڰ� ���ڸ��� �ǵ��� �Ѵ�.
			tmp /= 10;
		}
		
		if(number ==result) {
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		}else {
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
		}
		
	}
}
