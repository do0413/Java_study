package PDF_jeongSeok_2021;

public class Ex_5_8 {

	public static void main(String[] args) {
		//배열 answer에 담긴 데이터를 읽고 각 숫자가 들어있는 개수만큼 '*'을 찍는 프로그램.
		int[] answer = {3,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		int num=0;
		for(int i=0; i<answer.length; i++) {
			//num =answer[i];
			
			counter[answer[i]-1]++;
				
			
			}
		
		
		for(int i=0; i<counter.length; i++) {
			System.out.print(counter[i]);
			for(int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
