package pack09_scanner;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("나이를 입력하세요.");
		String Data = sc.nextLine();// 내가 엔터키 치기전까지의 문자열을 가져옴
		System.out.println("입력한 값에 + 20 이 됩니다.");
		String Data1 = sc.nextLine(); // 내가 엔터키 치기전까지의 문자열을 가져옴
		
		int sum = Integer.parseInt(Data);
		System.out.println(2024-sum + "년생 입니다.");
		int sum1 = Integer.parseInt(Data1)+20;
		System.out.println(sum+sum1);
		System.out.println("합계");
		
		//문제1. 스캐너로 소숫점이 있는 숫자 입력받아 +10 해보기.
		Scanner sc3 = new Scanner(System.in);
		String str = sc3.nextLine();
		double dNum1 = Double.parseDouble(str)+10;
		System.out.println(dNum1);
		
		
		//문제2. 스캐너로 소숫점이 잇는 숫자를 입력받아 정수형 데이터 타입으로 캐스팅해보기.
		Scanner sc4 = new Scanner(System.in);ㄴ
		String str4 = sc4.nextLine();
		double dNum4 = Double.parseDouble(str4);
		int iNum4 = (int) dNum4;
		System.out.println(iNum4);
		
		
		// 메모리 관리를 위해서 변수의 타입 마다 크기가 다르다
		// 또한 실수 , 정수를 표현하기 위해서
		// 변수의 나열 : 같은 타입일 경우 선언을 그룹으로 묶기 위해서 
		// 변수의 선언 : 타입에 이름을 정해주는 것
		// 변수의 할당 : 선언된 변수에 값(리터럴) 입력해주는 것
		// 변수의 초기화 : 선언과 동시에 할당하는 것
		
		//변수 타입 변경(형변환, 캐스팅)의 이해 : 다른 타입의 값을 더해야할 때 같은 타입으로 변경해주기 위해서
		//									문자열의 숫자를 숫자열으로 변경해야할 때 숫자열에는 문자열을 할당 불가능하기 때문에 
		// Scaner로 입력 받은 데이터 타입 변경의 이해? : 
		
		
	}
}
