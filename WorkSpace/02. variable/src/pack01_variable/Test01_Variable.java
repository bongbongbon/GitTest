package pack01_variable;

public class Test01_Variable {
	public static void main(String[] args) {
		// int num1 , int num2
		// 각각의 변수에는 숫자 1과 2가 담아져있음.
		// 값의 재할당 x, 두개의 숫자를 바꿔보기
		int num1 = 1;
		int num2 = 2;
		int temp = 0;
		//SWAP	
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(num1);
		System.out.println(num2);
	}

}
