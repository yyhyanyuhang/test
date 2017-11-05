import java.util.Random;
import java.util.Scanner;

// 手动输入1或2或3数字进入三个不同功能区(要求写三个方法)要求可以多次输入(运行完一次还可以再次执行)
		// 1代表的功能是随机产生一个0到100的数字(包含100)打印出来.
		// 2代表的功能是判断两个数的最大值并打印数来.数字需要手动输入
		// 3 代表的功能是根据输入的一个整数进行判断为基数还是偶数

public class Demo21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择1-3之间的一个数:");
		while(true){
			int a = sc.nextInt();
			switch(a){
			case 1 :
				getNum();
				System.out.println("请继续输入:");
				break;
			case 2 :
				getSum1();
				System.out.println("请继续输入:");
				break;
			case 3 :
				getSum();
				System.out.println("请继续输入:");
				break;
			default :
				System.out.println("你输入的有误,请输入1-3之间的数字:");
				break;
			}
		}
	}
	public static void getNum(){
		Random ran = new Random();
		int a = ran.nextInt(101);
		System.out.println("这个随机数是"+a);
	}
	public static void getSum1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数:");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int  s= a1 > b1 ? a1 : b1;
		System.out.println("这两个数的最大值是:"+s);
	}
	public static void getSum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int a = sc.nextInt();
		if(a % 2 == 0){
			System.out.println(a +"是偶数");
		}else{
			System.out.println(a+"是奇数");
		}
	}
}
