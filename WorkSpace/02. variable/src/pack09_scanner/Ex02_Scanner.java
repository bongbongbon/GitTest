package pack09_scanner;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("���̸� �Է��ϼ���.");
		String Data = sc.nextLine();// ���� ����Ű ġ���������� ���ڿ��� ������
		System.out.println("�Է��� ���� + 20 �� �˴ϴ�.");
		String Data1 = sc.nextLine(); // ���� ����Ű ġ���������� ���ڿ��� ������
		
		int sum = Integer.parseInt(Data);
		System.out.println(2024-sum + "��� �Դϴ�.");
		int sum1 = Integer.parseInt(Data1)+20;
		System.out.println(sum+sum1);
		System.out.println("�հ�");
		
		//����1. ��ĳ�ʷ� �Ҽ����� �ִ� ���� �Է¹޾� +10 �غ���.
		Scanner sc3 = new Scanner(System.in);
		String str = sc3.nextLine();
		double dNum1 = Double.parseDouble(str)+10;
		System.out.println(dNum1);
		
		
		//����2. ��ĳ�ʷ� �Ҽ����� �մ� ���ڸ� �Է¹޾� ������ ������ Ÿ������ ĳ�����غ���.
		Scanner sc4 = new Scanner(System.in);��
		String str4 = sc4.nextLine();
		double dNum4 = Double.parseDouble(str4);
		int iNum4 = (int) dNum4;
		System.out.println(iNum4);
		
		
		// �޸� ������ ���ؼ� ������ Ÿ�� ���� ũ�Ⱑ �ٸ���
		// ���� �Ǽ� , ������ ǥ���ϱ� ���ؼ�
		// ������ ���� : ���� Ÿ���� ��� ������ �׷����� ���� ���ؼ� 
		// ������ ���� : Ÿ�Կ� �̸��� �����ִ� ��
		// ������ �Ҵ� : ����� ������ ��(���ͷ�) �Է����ִ� ��
		// ������ �ʱ�ȭ : ����� ���ÿ� �Ҵ��ϴ� ��
		
		//���� Ÿ�� ����(����ȯ, ĳ����)�� ���� : �ٸ� Ÿ���� ���� ���ؾ��� �� ���� Ÿ������ �������ֱ� ���ؼ�
		//									���ڿ��� ���ڸ� ���ڿ����� �����ؾ��� �� ���ڿ����� ���ڿ��� �Ҵ� �Ұ����ϱ� ������ 
		// Scaner�� �Է� ���� ������ Ÿ�� ������ ����? : 
		
		
	}
}