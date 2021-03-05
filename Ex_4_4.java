package PDF_jeongSeok_2021;

public class Ex_4_4 {

	public static void main(String[] args) {
		int i, j;
		int num= 0, sum= 0;
		
		for(i=1; sum<=100; i++) {
			for(j=1; j<=100; j++) {
				if ( i%2==0) {
					num = -i;
				}
				else {
					num =i;
				}
				sum += num;
			}
			
			
		}
		System.out.println("몇까지 더해야 할까?" + sum);
	}

}
