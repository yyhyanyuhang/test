import java.util.Scanner;

//键盘输入两个整数比较两个数据是否相等
public class Demo03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		String s = i == j ? "相等":"不相等";
		System.out.println("这两个数:"+s);
		
	}
	public static boolean equalsSum(int a , int b){
		return a == b;
	}
}
