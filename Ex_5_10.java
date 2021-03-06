package PDF_jeongSeok_2021;

public class Ex_5_10 {

	public static void main(String[] args) {
		// 알파벳과 숫자를 암호표로 암호화하는 프로그램.
		char[] abcCode =
			{ 		'`','~','!','@','#','$','%','^','&','*',
					'(',')','-','_','+','=','|','[',']','{',
					'}',';',':',',','.','/'
			};
		
						// 0   1   2   3   4   5   6   7   8   9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result = "";
			
		// src charAt() result 문자열 의 문자를 으로 하나씩 읽어서 변환 후 에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			
			if('a' <= ch && ch<='z') {
				result += abcCode[ch-'a'];
			}else if ('0' <=ch && ch<='9') {
				result += numCode[ch-'0'];
			}
			
			
		}
		
		System.out.println("src:"+src); //암호화된 문자열
		System.out.println("result:"+result); //결과

	}

}
