//1)������Test2������main()������������������ط�����
//1.���巽��getMax���������������������ֵ��
//2.���巽��getMax���������������������ֵ��
//3.���巽��getMax�����������������������ֵ��
public class Demo17 {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		double d = 0.11;
		double e = 0.22;
		System.out.println("�������������ֵ��:"+getMax(a, b));
		System.out.println("�������������ֵ��:"+getMax(a, b,c));
		System.out.println("�������������ֵ��:"+getMax(d, e));
	}
	public static int getMax(int a, int b){
		return a > b ? a : b;
	}
	public static int getMax(int a, int b, int c){
		return a > b ?(a > c ? a : c ) : (b > c ? b : c);
	}
	public static double getMax(double a,double b){
		return a > b ? a : b;
	}
}
