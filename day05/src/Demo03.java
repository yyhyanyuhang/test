import java.util.Scanner;

//�����������������Ƚ����������Ƿ����
public class Demo03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		String s = i == j ? "���":"�����";
		System.out.println("��������:"+s);
		
	}
	public static boolean equalsSum(int a , int b){
		return a == b;
	}
}
