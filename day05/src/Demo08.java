//4���������ͱȽ����������Ƿ����
public class Demo08 {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		String s = equalsNum(a, b)? "���":"�����";
		System.out.println(s);
	}
	public static boolean equalsNum(int a,int b){
		return a == b;
	}
}
