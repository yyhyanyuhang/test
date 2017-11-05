//3)定义一个方法，计算1—n的累加和；n值由形参定义；将累加结果返回；
public class Demo14 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(getHe(n));
	}
	public static int getHe(int n){
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
