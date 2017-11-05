import java.util.Scanner;

//4)定义一个方法，查找三个数的最大值，将结果返回；
public class Demo15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个数比较大小:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("这三个数的最大值是:"+getSum(a,b,c));
	}
	public static int getSum(int a, int b, int c){
		return a > b ? (a > c ? a : c ):( b > c ? b : c);
	}
}
