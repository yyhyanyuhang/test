//��ӡ����ˮ�ɻ���
//ˮ�ɻ�������λ������λ������ + ʮλ������ + ��λ������ = �����
//	1.�������е���λ����100--999
//	2.��ȡÿ������
//	3.ȡ����λ��ʮλ����λ
public class Demo07 {
	public static void main(String[] args) {
		shuiXianHua();
	}
	public static void shuiXianHua(){
		for (int i = 100; i <= 999 ; i++) {
			int a = i % 10;
			int b = i/10%10;
			int c = i/10/10%10;
			if (a*a*a+b*b*b+c*c*c == i) {
				System.out.println(i);
			}
		}
	}
}
