import java.util.Scanner;

public class sum {
	static int sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int a = sc.nextInt();
		System.out.print("마지막 숫자: ");
		int b = sc.nextInt();
		sc.close();

		for (int i = a; i <= b; i++) {
			sum += i;
		}

		System.out.println(a + "부터 " + b + "까지의 합은 " + sum);
	}

}