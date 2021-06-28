import java.util.Scanner;

public class TesteRecursaoPar {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite um numero: ");
			int num = sc.nextInt();
			imprimePar(num);
		}
	}

	private static int imprimePar(int num) {
		if (num == 0) {
			return 0;
		}
		num = num -2;
		System.out.println(num);
		return imprimePar(num);
	}
}
