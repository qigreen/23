package defaul1;

import java.util.Scanner;

public class Khzy2 {
	// ��дһ������ʵ�ִ������в�������һ�ַ�����ͳ�Ƹ��ַ������ַ���e�����ֵĴ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = sc.nextLine();
		STR(str);
	}
	private static void STR(String str) {
		String str1="e";
		int a=0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i) == 'e'){
				a++;
			}
		}
		System.out.println("�ַ�����e����"+a+"��");
	}
}
