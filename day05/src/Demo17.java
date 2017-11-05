//1)定义类Test2，定义main()方法，并添加以下重载方法：
//1.定义方法getMax，可以求两个整数的最大值；
//2.定义方法getMax，可以求三个整数的最大值；
//3.定义方法getMax，可以求两个浮点数的最大值；
public class Demo17 {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		double d = 0.11;
		double e = 0.22;
		System.out.println("这两个数的最大值是:"+getMax(a, b));
		System.out.println("这三个数的最大值是:"+getMax(a, b,c));
		System.out.println("这两个数的最大值是:"+getMax(d, e));
	}
	public static int getMax(int a, int b){
		return a > b ? a : b;
	}
	public static int getMax(int a, int b, int c){
		return a > b ?(a > c ? a : c ) : (b > c ? b : c);
	}
	public static double getMax(double a,double b){
		return a > b ? a : b;
	}
}
