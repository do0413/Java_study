package PDF_jeongSeok;

public class Ex_4_8 {

	public static void main(String[] args) {
		// ������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. �� x�� y�� ����. �������� 0<=x<=10, 0<=y<=10�̴�.
		int x, y;
		
		for(x=0; x<=10; x++) {
			for(y=0; y<=10; y++) {
				if((2*x)+(4*y)==10) {
					System.out.print("[" + x +"," + y+ "]");
				}
				else {
					
				}
			}//for
			
		}//for

	}//main

}
