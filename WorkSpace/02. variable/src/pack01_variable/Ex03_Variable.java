package pack01_variable;

public class Ex03_Variable {
	public static void main(String[] args) {
		int value = 0 ;
		int result = value + 10;
		
//		int value = 30;
//		int result = value + 10;
		//������ �������� ��Ģ������ �����ϴ�.
		//���Ҵ�. (������ ��� ����°� �ƴ϶� ���� �ٽ� �༭ �ٲ�)
		result = 20/10;
		// result�� ������ ��Ģ������ ����� �����ϰ� ����
		//����غ���. - , * , / 		
		System.out.println(result);
		result = 5-3;
		System.out.println(result);
		result = 2*2;
		System.out.println(result);
		result = 6/2;
		System.out.println(result);
		result = value ; //���� Ÿ���� ������ ���� ���� �� �ִ�.
		
	}
}