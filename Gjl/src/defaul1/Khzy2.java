package defaul1;

import java.util.Scanner;

public class Khzy2 {
	// 编写一个程序，实现从命令行参数输入一字符串，统计该字符串中字符“e”出现的次数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串字符串：");
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
		System.out.println("字符串中e出现"+a+"次");
	}
}
