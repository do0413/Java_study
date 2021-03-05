package PDF_jeongSeok_2021;

public class Ex_4_6 {

	public static void main(String[] args) {
		//두개의 주사위를 던졌을때 눈의 합이 6이되는 모든 경우의 수를 출력하는 프로그램
		int i, j;
		int num=0;
		int sum=0;
		
		for(i=1; i<=6; i++) {
			for(j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.print("[" + i +"," + j + "]");
				}
				else {
					
				}
			}//for
			System.out.println("");
		}//for

	}//main

}
