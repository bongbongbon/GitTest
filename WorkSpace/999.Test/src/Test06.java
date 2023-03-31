
public class Test06 {
	public static void main(String[] args) {
		int korScore , mathScore , engScore , sciScore , phiScore ; 
		korScore = 80 ;
		mathScore = 88 ; 
		engScore = 90 ;
		sciScore = 95 ;
		phiScore = 100 ;
		System.out.println(korScore);
		
		// 형변환(Casting) : 서로 다른 타입의 변수를 변환시켜 사용함.
		// ex) int <-> double , String <-> int
		// int < double 
		int iValue = 10;
		double dValue = iValue + 0.5; // 아무것도 한것없음 ==> 자동 형변환
		System.out.println("iValue 값 : " + iValue); 
		System.out.println("dValue 값 : " + dValue);
		
		
		//더 큰 데이터타입을 작은 타입에 담을 때 오류가 발생함.
		//개발자가 어떤 타입으로 바꿀건지 명시를 해줘서 강제로 바꿈.
		//우리가 어떤 작업을 함 ==> 강제형변환
		iValue = (int) dValue ; //문제가 설명함=소숫점 유실
		System.out.println("iValue 값 : " + iValue); 
		System.out.println("dValue 값 : " + dValue);
		
		
		String str = "1234" + 12;// 답 : 123412
		//문자열에 어떤 값을 더하는 것 == 합x => 결합(글자의 합성)
		int iData = 1234 + 12; //답 : 1246
		//숫자형 데이터의 합은 == 합 => 값의 합침
		System.out.println(str);
		System.out.println(iData);
		
		//str에는 현재 123412라는 문자열이 저장되어있음.
		int sum = Integer.parseInt(str)+1;
		System.out.println(sum);
		
		// boolean (부울형) true 또는 false 만 저장이 가능함.
		
	}
}
