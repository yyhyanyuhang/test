import java.util.Scanner;

//��ӡ10��HelloWorld
public class Demo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӡ����HelloWorld:");
		int i = sc.nextInt();
		printHelloWorld(i);
	}
	public static void printHelloWorld(int a){
		for (int i = 0; i < a; i++) {
			System.out.println("HellwWorld"+(i+1));
		}
	}   
}
