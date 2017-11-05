//打印所有水仙花数
//水仙花数：三位数，个位的立方 + 十位的立方 + 百位的立方 = 这个数
//	1.遍历所有的三位数：100--999
//	2.获取每个数；
//	3.取出个位，十位，百位
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
