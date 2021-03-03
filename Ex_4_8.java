package PDF_jeongSeok;

public class Ex_4_8 {

	public static void main(String[] args) {
		// 방정식 2x+4y=10의 모든 해를 구하시오. 단 x와 y는 정수. 각범위는 0<=x<=10, 0<=y<=10이다.
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
