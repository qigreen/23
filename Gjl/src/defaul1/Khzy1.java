package defaul1;

import java.util.Scanner;

public class Khzy1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入两个数");
		String n=sc.nextLine();
		String n1=sc.nextLine();
		int s=Integer.parseInt(n);
		int c=Integer.parseInt(n1);
		int sum=s+c;
		System.out.println(sum);
	}

}
