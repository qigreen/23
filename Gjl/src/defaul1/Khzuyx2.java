package defaul1;

import java.util.Scanner;

public class Khzuyx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        if(email()){
            System.out.println("邮箱格式合法");
        }else{
            System.out.println("邮箱格式不合法");
        }
    }
	private static boolean email() {
		// TODO Auto-generated method stub
		return false;
	}
	public static boolean mailtest() {
        System.out.println("请输入你的邮箱地址:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // 5.1.1邮箱地址中不包含@或.
        if (s.indexOf("@") == -1 || s.indexOf(".") == -1) {
            System.out.println("输入的邮箱不合法没有包含@和.");
            return false;
        }
        // 5.1.2邮箱地址中含有多了@或.
        if (s.indexOf("@") != s.lastIndexOf("@")|| s.indexOf(".") != s.lastIndexOf(".")) {
            System.out.println("输入的邮箱中包含了多个的@和.");
            return false;
        }
        // 5.1.3邮箱地址中.出现在@的前面
       if (s.lastIndexOf("@") > s.lastIndexOf(".")) {
            System.out.println("输入的邮箱地址中.出现在了@前面");
            return false;
        }
        // 5.1.4用户名里有其他字符
       for (int i = 0; i < s.indexOf("@"); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' 
                    || s.charAt(i) >= 'A'&& s.charAt(i) <= 'Z'
                    ||s.charAt(i) >= '0'&& s.charAt(i) <= '9') {
                return true;
            } else {
                System.out.println("邮箱中包含了其他字符");
                return false;
            }
        }
        return true;
    }
}
