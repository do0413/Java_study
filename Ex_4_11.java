package PDF_jeongSeok;

public class Ex_4_11 {

	public static void main(String[] args) {
		// 피보나치 수열은 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 피보나치수열의 10번째는 ?
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; //세번째 값
		
		//System.out.print(num1+","+num2);
		
		for (int i=0; i<8; i++) {//0,1,2
			
				if (num3 ==0) {
					num3= num1+num2;//2
					//num2= num3;//2
				}
				
				else {
					num3 += num2;//3,
					num2 = num3;//3
				}
				
				
		}
		System.out.println(num3);
		
		
	}

}
