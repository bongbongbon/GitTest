package pack08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		String sum = "12" + 10;
		System.out.println(sum);
		//문자열로 변환
		String sum1 = ""+1234 + 3456 + 가나다;
		// 숫자열 앞에 더블 코테이션 넣으면 문자열로 변환이 가능하지만 그냥 문자 자체로 쳤을 때는 변경 안됨
		//ex)String sum1 = ""+1234 + 3456 + 간다; 
		//간다에 더블코테이션 넣어줘야 결과값 나옴 
		System.out.println(sum1);
	
		String sum2 = "1234";
		double dAvg = Double.parseDouble(sum2);
		System.out.println(sum2);
		
	}
}
