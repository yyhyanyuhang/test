//1)定义一个方法，计算并打印1—100的累加和；
public class Demo12 {
	public static void main(String[] args) {
		getHe();
	}
	public static void getHe(){
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
