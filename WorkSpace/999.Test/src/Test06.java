
public class Test06 {
	public static void main(String[] args) {
		int korScore , mathScore , engScore , sciScore , phiScore ; 
		korScore = 80 ;
		mathScore = 88 ; 
		engScore = 90 ;
		sciScore = 95 ;
		phiScore = 100 ;
		System.out.println(korScore);
		
		// ����ȯ(Casting) : ���� �ٸ� Ÿ���� ������ ��ȯ���� �����.
		// ex) int <-> double , String <-> int
		// int < double 
		int iValue = 10;
		double dValue = iValue + 0.5; // �ƹ��͵� �Ѱ;��� ==> �ڵ� ����ȯ
		System.out.println("iValue �� : " + iValue); 
		System.out.println("dValue �� : " + dValue);
		
		
		//�� ū ������Ÿ���� ���� Ÿ�Կ� ���� �� ������ �߻���.
		//�����ڰ� � Ÿ������ �ٲܰ��� ���ø� ���༭ ������ �ٲ�.
		//�츮�� � �۾��� �� ==> ��������ȯ
		iValue = (int) dValue ; //������ ������=�Ҽ��� ����
		System.out.println("iValue �� : " + iValue); 
		System.out.println("dValue �� : " + dValue);
		
		
		String str = "1234" + 12;// �� : 123412
		//���ڿ��� � ���� ���ϴ� �� == ��x => ����(������ �ռ�)
		int iData = 1234 + 12; //�� : 1246
		//������ �������� ���� == �� => ���� ��ħ
		System.out.println(str);
		System.out.println(iData);
		
		//str���� ���� 123412��� ���ڿ��� ����Ǿ�����.
		int sum = Integer.parseInt(str)+1;
		System.out.println(sum);
		
		// boolean (�ο���) true �Ǵ� false �� ������ ������.
		
	}
}