import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		/*
		 * Leia um número no console e depois faça o cálculo do quadrado desse número e
		 * exiba o resultado no console. Lembrando que o quadrado de um número é
		 * calculado multiplicando-se o número por ele mesmo. Por exemplo, para
		 * encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo como
		 * resultado o número 4.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calculando o quadrado de um número");
		System.out.print("Digite um número inteiro: ");

		Integer result = scanner.nextInt();
		System.out.println("O quadrado de " + result + " é: "  + (result * result));

		scanner.close();
	}
}
