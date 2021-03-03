package PDF_jeongSeok;

public class Ex_4_7 {

	public static void main(String[] args) {
		// Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드 완성하시오.
		
		int value = (int) (Math.random()*6)+1; //해당 메소드는 정수타입으로 바꾸어주어야만 한다 !
		
		System.out.println("value:" + value);

	}

}
