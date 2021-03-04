package PDF_jeongSeok;

public class Ex_4_13 {

	public static void main(String[] args) {
		// 문자열, 숫자를 판별하는 프로그램이다. 완성하시오.
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		//반복문과 charat(int i)를 이용해서 문자열의 문자를 하나씩 검사.
		for(int i=0; i<value.length(); i++) {
			ch= value.charAt(i);
			
			
			if (ch>57) {
				System.out.println("해당 값의 " + (i+1) + "번째 값은 문자군요!");
			}
			else {
				System.out.println("해당 값의 " + (i+1) + "번째 값은 숫자군요!");
			}
		}
	}

}
