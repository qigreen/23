package defaul1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Khzy3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("�������������Χ");
		System.out.println("�����뷶Χ�����ֵ");
		int  t=s.nextInt();
		System.out.println("�����뷶Χ����Сֵ");
		int t1=s.nextInt();
		int a[]=new int [4];
		Random r=new Random();
		for(int y=0;y<a.length;y++) {
			a[y]=t1+r.nextInt(t);
			
		}
		Arrays.sort(a);
		for(int  u:a) {
			System.out.print(u+"\t");
		}
	}
	}
	
