package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
		//int �̻��� ���� ���� �� �ִ� ������ ������Ÿ���� ������.
		//long�� l1�̶�� ������ �����ϱ�.
		//long�� l2�̶�� ������ �ʱ�ȭ ��Ű��.12345678901
		long l1;
		long l2 = 12345678901L;//����+longŸ���̶�� ������
		System.out.println(l2);
		
		//�Ǽ��� ������ Ÿ�� : float, double
		//�Ǽ����� �Ҽ����� �ִ°��� ǥ���ϱ� ���� ����
		//float�� long�� ���������� ������ F�� �ٿ���߸���.
		float a;
		a = 1.01F;
		float b = 20.03F;
		double c;
		c = 110.01;
		double d = 220.06;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		// �ڿ� �����ڰ� �ٴ� long, float ���ϴ�??
		// ��ǥ�� :�� int , double ��
	}
}