import java.util.Random;
import java.util.Scanner;

// �ֶ�����1��2��3���ֽ���������ͬ������(Ҫ��д��������)Ҫ����Զ������(������һ�λ������ٴ�ִ��)
		// 1����Ĺ������������һ��0��100������(����100)��ӡ����.
		// 2����Ĺ������ж������������ֵ����ӡ����.������Ҫ�ֶ�����
		// 3 ����Ĺ����Ǹ��������һ�����������ж�Ϊ��������ż��

public class Demo21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ��1-3֮���һ����:");
		while(true){
			int a = sc.nextInt();
			switch(a){
			case 1 :
				getNum();
				System.out.println("���������:");
				break;
			case 2 :
				getSum1();
				System.out.println("���������:");
				break;
			case 3 :
				getSum();
				System.out.println("���������:");
				break;
			default :
				System.out.println("�����������,������1-3֮�������:");
				break;
			}
		}
	}
	public static void getNum(){
		Random ran = new Random();
		int a = ran.nextInt(101);
		System.out.println("����������"+a);
	}
	public static void getSum1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������������:");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int  s= a1 > b1 ? a1 : b1;
		System.out.println("�������������ֵ��:"+s);
	}
	public static void getSum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����:");
		int a = sc.nextInt();
		if(a % 2 == 0){
			System.out.println(a +"��ż��");
		}else{
			System.out.println(a+"������");
		}
	}
}
