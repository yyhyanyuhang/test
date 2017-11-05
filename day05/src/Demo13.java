import java.util.Scanner;

//2)定义一个方法，可以打印n行m列的“*”符号；m,n由形式参数决定
public class Demo13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你想打印的行数:");
		int a = sc.nextInt();
		System.out.println("请输入你想打印的列数:");
		int b = sc.nextInt();
		System.out.println("请看!!!!!");
		print(a,b);
	}
	public static void print(int n,int m){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
