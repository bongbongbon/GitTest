package pack02_byte;

public class Ex01_Byte {
	public static void main(String[] args) {
		// { } <= main ����
		// byte Ÿ���� ������ �����غ���
		byte var1;
		var1 = 0;	
		byte var2 = 10;
		// byte�� ���õ� 8���� ��Ʈ��� �����Ǿ�����.
		// bit 0�Ǵ� 1 �ΰ��� ������ ǥ���� �� �ִ�
		// �ּ����� ����ǥ�� ���� �Դϴ�.
		// -128 ~ 127 ǥ�� ����
		// var1���� -128�� ���Ҵ� , var2���� 127�� ���Ҵ�
		// �ϰ� ����غ���.
		// �� ������ ǥ�� ������ ������ ������ �ش��ϴ� ����
		// �ȿ��� ��� ��
		var1 = -128;
		var2 = 127;
		System.out.println(var1);
		System.out.println(var2);
		int num1 = 1234567890;
	}
}
