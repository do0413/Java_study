package PDF_jeongSeok_2021;

public class Ex_5_6 {

	public static void main(String[] args) {
		// 거스름돈을 몇 개의 동전으로 지불할 수 있을까 ?(단, 가능한 한 적은 수의 동전으로 거슬러주어야한다.)
		
		int[] coinUnit= {500,100,50,10};
		int num2=0;
		int money=2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) {
				
				int num = money/coinUnit[i]; //몫
				money = money%coinUnit[i]; //나머지
				
				if (num!=0) { //0으로 나누어 떨어지지않으면 다음으로 넘어감.(반복함.)
				
					System.out.println(coinUnit[i]+"원:"+ num);
					
				}else {
					break;
				}
				
				
			
			
		}
		
		
	}

}
