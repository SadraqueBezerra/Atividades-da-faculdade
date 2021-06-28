import java.util.Scanner;

public class TesteFinonacci {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite um numero: ");
			int num = sc.nextInt();
			tribonacci(num);
		}
	}

	private static void tribonacci(int num) {
		int t1 = 0;
		int t2 = 1;
		int t3 = 1;
		int cont = 3;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		while (cont <= num) {
			int t4 = t1 + t2 + t3;
			System.out.println(t4);
			t1 = t2;
			t2 = t3;
			t3 = t4;

			cont += 1;
		}
		System.out.println("fim");
	}
}
