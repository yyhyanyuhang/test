//4种数据类型比较两个数据是否相等
public class Demo08 {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		String s = equalsNum(a, b)? "相等":"不相等";
		System.out.println(s);
	}
	public static boolean equalsNum(int a,int b){
		return a == b;
	}
}
