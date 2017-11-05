import java.util.Scanner;

//输出nn乘法表。要求：在主方法里键盘录入n(1<=n<=9)，并调用打印nn乘法表的方法。
public class Demo19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1-9");
		int a = sc.nextInt();
		if(a <9){
			chengFaBiao(a);
		}else{
			System.out.println("输入数字有误!请重新输入1-9的数字:");
		}
	}
	public static void chengFaBiao(int a){
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
