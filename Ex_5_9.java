package PDF_jeongSeok_2021;

public class Ex_5_9 {

	public static void main(String[] args) {
		//�־��� �迭�� �ð�������� 90�� ȸ�����Ѽ� ����ϴ� ���α׷�
		
		char[][] star = {
				 {'*','*',' ',' ',' '}
				,{'*','*',' ',' ',' '}
				,{'*','*','*','*','*'}
				,{'*','*','*','*','*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				int x = star.length-1-i;//5-1-1=3
				result[j][x]=star[i][j];
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

	}

}
