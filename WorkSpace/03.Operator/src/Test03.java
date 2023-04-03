import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//다항연산자 또는 이항연산자를 이용해서 문제 풀어보기.
		//Scanner 이용해보기.
		
		//콘솔창을 통해서 입력받아온 String 데이터를 int로 바꾼후 해당 숫자가 짝수인지 또는 홀수인지를 판단하여 
		//콘솔창에 출력하세요. 1=>홀수 , 2=>짝수....
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		
		int iNum = Integer.parseInt(inputData);
		String  str = (iNum % 2 == 1 ? "홀수" : "짝수");
		System.out.println(str);
		
		//콘솔창을 통해서 String 데이터를 (숫자) 두개 입력 받는다.
		// 각각의 숫자는 num1 과 num2로 구분한다.
		// 두숫자의 더하기 ,  빼기 , 곱하기 , 나누기 한 결과를 출력하기.
		String inputData1 = sc.nextLine();
		String inputData2 = sc.nextLine();
		int num1 = Integer.parseInt(inputData1);
		int num2 = Integer.parseInt(inputData2);
		System.out.println("num1 + num2 =" +(num1 + num2));		
		System.out.println("num1 - num2 =" +(num1 - num2));
		System.out.println("num1 * num2 =" +(num1 * num2));
		System.out.println("num1 / num2 =" +(num1 / num2));
		
		//두숫자 중 더 큰숫자가 어떤 숫자인지 표시하기.
		int result = num1 < num2 ? num2 : num1;
		System.out.println("더 큰 숫자는 " + result + " 입니다.");
		
		
		

		
		
	
	}
}
