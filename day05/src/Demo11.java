//���巽��������Ԫ�����
public class Demo11 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("����Ԫ�صĺ�Ϊ:"+getNum(arr));
	}
	public static int getNum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
