package PDF_jeongSeok_2021;

public class Ex_4_13_2 {

	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		//�ݺ����� charat(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �˻�.
		for(int i=0; i<value.length(); i++) {
			ch= value.charAt(i);
			
			
			if (!('0'<=ch && ch<='9')) {
				isNumber = false;
				break;
			}
			
		}
		if(isNumber) {
			System.out.println(value+ "�� ���ڳ׿�!");
		}
		else {
			System.out.println(value+ "�� ���ڰ� �ƴϳ׿� !");
		}
	}

}
