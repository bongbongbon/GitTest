package pack01_variable;

public class Ex03_Variable {
	public static void main(String[] args) {
		int value = 0 ;
		int result = value + 10;
		
//		int value = 30;
//		int result = value + 10;
		//숫자형 변수들은 사칙연산이 가능하다.
		//재할당. (변수를 계속 만드는게 아니라 값을 다시 줘서 바꿈)
		result = 20/10;
		// result에 나머지 사칙연산의 결과를 저장하고 각각
		//출력해보기. - , * , / 		
		System.out.println(result);
		result = 5-3;
		System.out.println(result);
		result = 2*2;
		System.out.println(result);
		result = 6/2;
		System.out.println(result);
		result = value ; //같은 타입의 변수는 값을 담을 수 있다.
		
	}
}
