//1)����һ�����������㲢��ӡ1��100���ۼӺͣ�
public class Demo12 {
	public static void main(String[] args) {
		getHe();
	}
	public static void getHe(){
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
