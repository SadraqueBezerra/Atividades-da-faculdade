import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePilha {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite um numero: ");
			int num = sc.nextInt();
			binario(num);
		}

	}

	public static void binario(int numero) {
		int d = numero;
		StringBuffer binario = new StringBuffer();
		List<Integer> teste = new ArrayList<>();
		while (d > 0) {
			int b = d % 2;
			teste.add(b);
			binario.append(b);
			d = d >> 1;
		}
		for (int i = 0; i < teste.size(); i++) {
			System.out.println(teste.get(i));
		}
		System.out.println("Número convertido: " + binario.reverse().toString());
	}
}
