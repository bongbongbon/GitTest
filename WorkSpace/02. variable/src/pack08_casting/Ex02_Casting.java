package pack08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		// ���ڿ� = "12" + 34 = 1234
		// String + int = String
		// why? ���ڿ� + ��� = ���ڿ� ��Ģ
		// ���ڿ� ������ ��Ģ ��
		// "1"(String) �ٸ��� 1(����) ?
		String sum ="12" + 34;
		System.out.println(sum);
		// � ���� String���� �ٲٴ� ���� ��û���� �����ϴ�.
		String sum2 = "" + 1234 + 10 ;
		System.out.println(sum2);
		
		//Stirng sum , sum2 ������ ���ڿ��� ���ڸ� �����ص�.
		// �ΰ��� ���� �˰� �ʹ�. "1234" + "1234"
		// 12341234
		// ���� 1234 + 1234 = 2468�� ����� ���� �Ѵ�.
		// String => int ?
		//int , double ���� ��������� �۾� �ٲ�°� => �⺻Ÿ��
		// �빮�ڷ� ������ �͵��� ��κ� ClassŸ��
		// �⺻ ������ Ÿ���� Wrapper class��°��� ������ �ִ�.
		// int => ��Integer�� , double Double
		// String�� �ش��ϴ� Ÿ������ �ٲ��ִ� ������ �ϴ� ��
		// String�� �ִ� ""<=�� �����Ѵ�.
		int num = Integer.parseInt( sum ) + 1234;
		//num2�� sum2�� ���ڷ� �ٲ㼭 �־��.
		int num2 = Integer.parseInt(sum2);
		System.out.println(num + num2);
		String sAvg = "88.6";
		double dAvg = Double.parseDouble(sAvg);
		System.out.println(dAvg + 10);
		//wrapperClass.parseDataType(string); => DataType
		String str = "�����";
		//�� �ش� �����͸� ���ڷ� �ٲ� �� ������? wrapperClass �̿�
		int str1 = Integer.parseInt(str);
		System.out.println(str1);
		//float.parseFloat(sAvg)
		//Long/parseLong(sAvg)
		//Byte.parseLong(sAvg)
	}
}