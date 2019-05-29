package defaul1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Khzy3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入随机数范围");
		System.out.println("请输入范围中最大值");
		int  t=s.nextInt();
		System.out.println("请输入范围中最小值");
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
	
