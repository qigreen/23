package defaul1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Khzyx1 {

	public static void main(String[] args) {
		System.out.println("��������Ҫ��ѯ������,��ʽΪyyyy��MM��dd��kk��");
		System.out.println("����:2014��7��7��11��");

		Scanner scanner = new Scanner(System.in);
		String time = scanner.nextLine();

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy��MM��dd��kk��");
		try {
			Date nowday = sdFormat.parse(time);
			calendar.setTime(nowday);
			// ����
			calendar.add(Calendar.HOUR_OF_DAY, -7);
			System.out.println("����ʱ����:" + calendar.get(Calendar.YEAR) + "��, " + (calendar.get(Calendar.MONTH) + 1) + "��"
					+ calendar.get(Calendar.DAY_OF_MONTH) + "��," + calendar.get(Calendar.HOUR_OF_DAY) + "��");
			// ŦԼ
			calendar.add(Calendar.HOUR_OF_DAY, -5);
			System.out.println("ŦԼʱ����:" + calendar.get(Calendar.YEAR) + "��, " + (calendar.get(Calendar.MONTH) + 1) + "��"
					+ calendar.get(Calendar.DAY_OF_MONTH) + "��," + calendar.get(Calendar.HOUR_OF_DAY) + "��");
		} catch (Exception e) {
			System.out.println("��������ڸ�ʽ����,����������!");
		}

	}

}
