package pack08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		String sum = "12" + 10;
		System.out.println(sum);
		//���ڿ��� ��ȯ
		String sum1 = ""+1234 + 3456 + ������;
		// ���ڿ� �տ� ���� �����̼� ������ ���ڿ��� ��ȯ�� ���������� �׳� ���� ��ü�� ���� ���� ���� �ȵ�
		//ex)String sum1 = ""+1234 + 3456 + ����; 
		//���ٿ� ���������̼� �־���� ����� ���� 
		System.out.println(sum1);
	
		String sum2 = "1234";
		double dAvg = Double.parseDouble(sum2);
		System.out.println(sum2);
		
	}
}