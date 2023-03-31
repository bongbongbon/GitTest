
package pack09_Scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		//Scanner 01
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		int iNum = (int) Double.parseDouble(str);
		System.out.println(iNum);
				
		//Scanner 02
		Scanner sc1 = new Scanner (System.in);
		String str1 = sc1.nextLine();
		double dNum1 = Double.parseDouble(str1);
		int iNum1 = (int) dNum1;
		System.out.println(iNum1);
	}
}
