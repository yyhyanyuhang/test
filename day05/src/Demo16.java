
public class Demo16 {
		public static void main(String[] args) {
			int max = getMax(28,52,32);
			System.out.println("三个数中最大值为："+max);
		}
		
		private static int getMax(int i, int j, int k) {
			int a;
			if(j > i){
				a = i;
				i = j;
				j = a;
			}
			if(k > i){
				a = i;
				i = k;
				k = a;
			}
			return i;
		}
}
