package PDF_jeongSeok_2021;

public class Ex_4_15 {
	public static void main(String[] args) {
		//회문수를 구하는 프로그램. 
		int number =12321;
		int tmp = number;
		
		int result =0;// 변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp !=0) {
			result = result*10 + tmp %10; //10씩 곱해서 횟수를 거듭할수록 앞에 찍힌 숫자가 앞자리가 되도록 한다.
			tmp /= 10;
		}
		
		if(number ==result) {
			System.out.println(number + "는 회문수 입니다.");
		}else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
		
	}
}
