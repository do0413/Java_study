package PDF_jeongSeok;

public class Ex_4_13 {

	public static void main(String[] args) {
		// ���ڿ�, ���ڸ� �Ǻ��ϴ� ���α׷��̴�. �ϼ��Ͻÿ�.
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		//�ݺ����� charat(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �˻�.
		for(int i=0; i<value.length(); i++) {
			ch= value.charAt(i);
			
			
			if (ch>57) {
				System.out.println("�ش� ���� " + (i+1) + "��° ���� ���ڱ���!");
			}
			else {
				System.out.println("�ش� ���� " + (i+1) + "��° ���� ���ڱ���!");
			}
		}
	}

}
