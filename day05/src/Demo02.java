import java.util.Scanner;

//������������������ȡ���������еĽϴ�ֵ
public class Demo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("���������Ľϴ�ֵ:"+getMax(i,j));
	}
	public static int getMax(int a,int b){
		return a > b ? a : b;
	}
}
