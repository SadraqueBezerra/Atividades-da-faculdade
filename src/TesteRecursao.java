import java.util.Scanner;

public class TesteRecursao {

	public static void main(String[] args) throws Exception {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite um numero par: ");
			int num = sc.nextInt();
			try {
				divisao(num);
			} catch (Exception e) {
				System.out.println("Fim");
			}
		}

	}

	public static void divisao(int numero) throws Exception {
		int d = numero;

		for (int i = d; i >= 0; i--) {
			d = d - 2;
			System.out.println(d);
			if (d == 0) {
				throw new Exception("fim");
			}
		}

	}

}
