package PDF_jeongSeok_2021;

public class Ex_4_3 {
	public static void main(String[] args) {
		int i, j;
		int num=0 , sum=0;

		for(i=1; i<=10; i++) {
			for(j=1; j<=i; j++) {
				num += j;
			}
			sum += num;
			
		 } 
		System.out.println("°á°ú : " + sum);
	}//main
}
