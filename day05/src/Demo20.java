//编写方法将下面的数组元素前后互换
//[11, 32，55, 47，79，23]	
//置换后的数组元素为：
//[23, 79, 47, 55, 32, 11]
public class Demo20 {
	public static void main(String[] args) {
		int[] arr = {11,32,55,47,79,23};
		printArr(arr);
		swapArr(arr);
		printArr(arr);	
	}
	public static void swapArr(int[] arr){
		for (int i=0,j=arr.length-1; i<j; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printArr(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.println(arr[i]+"]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
}
