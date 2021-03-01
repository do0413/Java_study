package Chart05;

import java.util.Scanner;

public class test01 {

	
	public static void main(String[] args) {
		
		System.out.println("3이상의 홀수를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); //입력한수를 이용한다.
		int a = (num+1)/2;
		int b = num-a;
		
		for(int i=0; i<a; i++) {
			
				
				for(int j=0; j<(num-1)/2-i; j++) { //공백출력
						
					System.out.print(" ");
				}
				
				
				for(int j=0; j<2*i+1; j++) {
					
					System.out.print("*");	
				}
				
				System.out.println("");
		}
		
		for(int i=0; i<b; i++) {
			
	
				for(int j=0; j<i+1; j++) {
					
					System.out.print(" ");	
				}
				
				for(int j=0; j<num-2-2*i; j++) {
					
					System.out.print("*");
				}
				
				System.out.println("");
		}
		
	}//main
}//class
