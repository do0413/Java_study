package PDF_jeongSeok_2021;

public class Ex_5_6 {

	public static void main(String[] args) {
		// �Ž������� �� ���� �������� ������ �� ������ ?(��, ������ �� ���� ���� �������� �Ž����־���Ѵ�.)
		
		int[] coinUnit= {500,100,50,10};
		int num2=0;
		int money=2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) {
				
				int num = money/coinUnit[i]; //��
				money = money%coinUnit[i]; //������
				
				if (num!=0) { //0���� ������ �������������� �������� �Ѿ.(�ݺ���.)
				
					System.out.println(coinUnit[i]+"��:"+ num);
					
				}else {
					break;
				}
				
				
			
			
		}
		
		
	}

}
