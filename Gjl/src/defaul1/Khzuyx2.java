package defaul1;

import java.util.Scanner;

public class Khzuyx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        if(email()){
            System.out.println("�����ʽ�Ϸ�");
        }else{
            System.out.println("�����ʽ���Ϸ�");
        }
    }
	private static boolean email() {
		// TODO Auto-generated method stub
		return false;
	}
	public static boolean mailtest() {
        System.out.println("��������������ַ:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // 5.1.1�����ַ�в�����@��.
        if (s.indexOf("@") == -1 || s.indexOf(".") == -1) {
            System.out.println("��������䲻�Ϸ�û�а���@��.");
            return false;
        }
        // 5.1.2�����ַ�к��ж���@��.
        if (s.indexOf("@") != s.lastIndexOf("@")|| s.indexOf(".") != s.lastIndexOf(".")) {
            System.out.println("����������а����˶����@��.");
            return false;
        }
        // 5.1.3�����ַ��.������@��ǰ��
       if (s.lastIndexOf("@") > s.lastIndexOf(".")) {
            System.out.println("����������ַ��.��������@ǰ��");
            return false;
        }
        // 5.1.4�û������������ַ�
       for (int i = 0; i < s.indexOf("@"); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' 
                    || s.charAt(i) >= 'A'&& s.charAt(i) <= 'Z'
                    ||s.charAt(i) >= '0'&& s.charAt(i) <= '9') {
                return true;
            } else {
                System.out.println("�����а����������ַ�");
                return false;
            }
        }
        return true;
    }
}
