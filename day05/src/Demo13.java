import java.util.Scanner;

//2)����һ�����������Դ�ӡn��m�еġ�*�����ţ�m,n����ʽ��������
public class Demo13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ӡ������:");
		int a = sc.nextInt();
		System.out.println("�����������ӡ������:");
		int b = sc.nextInt();
		System.out.println("�뿴!!!!!");
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
