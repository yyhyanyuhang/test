//定义方法获取数组最值
public class Demo10 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] ra = getMax(a);
		System.out.println("最大值:"+ra[0]);
		System.out.println("最小值:"+ra[1]);
	}
	public static int[] getMax(int[] arr){
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max = arr[i] > max ? arr[i]:max;
			min = arr[i] < min ? arr[i]:min;
		}
		int[] ra = new int[2];
		ra[0] = max;
		ra[1] = min;
		return  ra;
	}
}
