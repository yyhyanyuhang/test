import java.util.Scanner;

//4)����һ�����������������������ֵ����������أ�
public class Demo15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������Ƚϴ�С:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("�������������ֵ��:"+getSum(a,b,c));
	}
	public static int getSum(int a, int b, int c){
		return a > b ? (a > c ? a : c ):( b > c ? b : c);
	}
}
