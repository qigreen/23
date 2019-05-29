package defaul1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Khzyx1 {

	public static void main(String[] args) {
		System.out.println("请输入您要查询到日期,格式为yyyy年MM月dd日kk点");
		System.out.println("例如:2014年7月7日11点");

		Scanner scanner = new Scanner(System.in);
		String time = scanner.nextLine();

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy年MM月dd日kk点");
		try {
			Date nowday = sdFormat.parse(time);
			calendar.setTime(nowday);
			// 巴黎
			calendar.add(Calendar.HOUR_OF_DAY, -7);
			System.out.println("巴黎时间是:" + calendar.get(Calendar.YEAR) + "年, " + (calendar.get(Calendar.MONTH) + 1) + "月"
					+ calendar.get(Calendar.DAY_OF_MONTH) + "日," + calendar.get(Calendar.HOUR_OF_DAY) + "点");
			// 纽约
			calendar.add(Calendar.HOUR_OF_DAY, -5);
			System.out.println("纽约时间是:" + calendar.get(Calendar.YEAR) + "年, " + (calendar.get(Calendar.MONTH) + 1) + "月"
					+ calendar.get(Calendar.DAY_OF_MONTH) + "日," + calendar.get(Calendar.HOUR_OF_DAY) + "点");
		} catch (Exception e) {
			System.out.println("输入的日期格式错误,请重新输入!");
		}

	}

}
