//3)����һ������������1��n���ۼӺͣ�nֵ���βζ��壻���ۼӽ�����أ�
public class Demo14 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(getHe(n));
	}
	public static int getHe(int n){
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
