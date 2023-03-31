package pack02_byte;

public class Ex01_Byte {
	public static void main(String[] args) {
		// { } <= main 지역
		// byte 타입의 변수를 선언해보기
		byte var1;
		var1 = 0;	
		byte var2 = 10;
		// byte는 관련된 8개의 비트들로 구성되어있음.
		// bit 0또는 1 두가지 정보를 표현할 수 있는
		// 최소한의 정보표현 단위 입니다.
		// -128 ~ 127 표현 가능
		// var1에는 -128을 재할당 , var2에는 127을 재할당
		// 하고 출력해보기.
		// ※ 변수는 표현 범위를 가지기 때문에 해당하는 범위
		// 안에서 사용 ※
		var1 = -128;
		var2 = 127;
		System.out.println(var1);
		System.out.println(var2);
		int num1 = 1234567890;
	}
}
