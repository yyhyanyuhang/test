import java.util.Scanner;

//键盘输入三个整数获取三个数据中的较大值
public class Demo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个数");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		System.out.println("这三个数的最大值:"+equalsSum( i, j ,k));
	}
	public static int equalsSum(int a, int b, int c){
		return a > b ?(a > c ? a : c):(b > c ? b : c);
	}
}
