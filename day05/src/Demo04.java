import java.util.Scanner;

//������������������ȡ���������еĽϴ�ֵ
public class Demo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		System.out.println("�������������ֵ:"+equalsSum( i, j ,k));
	}
	public static int equalsSum(int a, int b, int c){
		return a > b ?(a > c ? a : c):(b > c ? b : c);
	}
}
