//定义一个方法传递一个整数(大于1)在控制台打印1到该数据的值
public class Demo06 {
	public static void main(String[] args) {
		int a = 10;
		printNum(a);
	}
	public static void printNum(int a){
		for (int i = 0; i < a; i++) {
			System.out.println(i+1);
		}
	}
}
