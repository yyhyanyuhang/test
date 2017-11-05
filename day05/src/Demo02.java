import java.util.Scanner;

//键盘输入两个整数获取两个数据中的较大值
public class Demo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("这两个数的较大值:"+getMax(i,j));
	}
	public static int getMax(int a,int b){
		return a > b ? a : b;
	}
}
