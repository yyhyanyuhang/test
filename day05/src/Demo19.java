import java.util.Scanner;

//���nn�˷���Ҫ���������������¼��n(1<=n<=9)�������ô�ӡnn�˷���ķ�����
public class Demo19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������1-9");
		int a = sc.nextInt();
		if(a <9){
			chengFaBiao(a);
		}else{
			System.out.println("������������!����������1-9������:");
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
