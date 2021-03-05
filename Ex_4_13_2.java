package PDF_jeongSeok_2021;

public class Ex_4_13_2 {

	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		//반복문과 charat(int i)를 이용해서 문자열의 문자를 하나씩 검사.
		for(int i=0; i<value.length(); i++) {
			ch= value.charAt(i);
			
			
			if (!('0'<=ch && ch<='9')) {
				isNumber = false;
				break;
			}
			
		}
		if(isNumber) {
			System.out.println(value+ "는 숫자네요!");
		}
		else {
			System.out.println(value+ "는 숫자가 아니네요 !");
		}
	}

}
