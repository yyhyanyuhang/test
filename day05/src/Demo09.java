//_定义方法遍历数组
public class Demo09 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		array(arr);
	}
	public static void array(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
