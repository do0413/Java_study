package PDF_jeongSeok_2021;

public class Ex_4_12 {

	public static void main(String[] args) {
		// 구구단의 일부를 출력하시오.
		int front=-1;
		int back=0;
		int num1=0;

		for (int i=1; i<=3; i++) {
			front=-1;
			front += 3*i;
			
			
			
			for (int j=1; j<=3; j++) {
				num1= front;
				back++;
				for (int k=1; k<=3; k++) {
					System.out.print(num1 + "*" + back +"=" + (num1*back) + "    ");
					num1++;
					
					if(num1 >=10) {
						break;
					}
				}
				System.out.println("");
			
				
			}
			System.out.println("");
			
			
			
		}//for
		
	}//main

}
