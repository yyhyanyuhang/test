//判断指定的年份是平年还是闰年，返回对应的天数
public class Demo18 {

		public static void main(String[] args) {
			boolean flag = isLeapYear(2016);
			if (flag) {
				System.out.println(366);
			} else {
				System.out.println(365);
			}
		}
		public static boolean isLeapYear(int year) {
			boolean isLeapYear = false;
			if (year%100 == 0 && year%400 ==0) {
				isLeapYear = true;
			} else if (year%4 == 0) {
				isLeapYear = true;
			} else {
				isLeapYear = false;
			}
			return isLeapYear;
		}
}
